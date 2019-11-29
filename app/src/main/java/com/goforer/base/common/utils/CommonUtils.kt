package com.goforer.base.common.utils

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.ContentUris
import android.content.Context
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.icu.util.Calendar
import android.net.Uri
import android.os.*
import android.provider.DocumentsContract
import android.provider.MediaStore
import android.view.Gravity
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.goforer.sotong.R
import timber.log.Timber
import java.io.FileDescriptor
import java.io.IOException
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

object CommonUtils {
    private const val MAX_SCROLL = 10

    @JvmField val VERBOSE_NOTIFICATION_CHANNEL_NAME: CharSequence = "Verbose WorkManager Notifications"
    private const val VERBOSE_NOTIFICATION_CHANNEL_DESCRIPTION = "Shows notifications whenever work starts"
    @JvmField val NOTIFICATION_TITLE: CharSequence = "Megatong Upload Status"
    private const val CHANNEL_ID = "VERBOSE_NOTIFICATION"
    private const val NOTIFICATION_ID = 1

    fun showToastMessage(activity: Activity, text: String, duration: Int) {
        val inflater = activity.layoutInflater
        val layout = inflater.inflate(R.layout.custom_toast,
            activity.findViewById(R.id.custom_Toast_container))

        val phrase = layout.findViewById<AppCompatTextView>(R.id.tv_text)

        phrase.text = text

        val toast = Toast(activity.applicationContext)

        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.duration = duration
        toast.view = layout
        toast.show()
    }

    @SuppressLint("TimberArgCount")
    fun getPackageName(context: Context): String {
        val manager = context.packageManager
        var packageName = context.packageName
        try {
            val info = manager.getPackageInfo(packageName, 0)
            packageName = info.applicationInfo.dataDir
        } catch (e: PackageManager.NameNotFoundException) {
            Timber.w(e)
        }

        return packageName
    }

    @SuppressLint("SimpleDateFormat")
    @Throws(ParseException::class)
    fun convertDateToLong(text: String): Long {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
        dateFormat.timeZone = TimeZone.getTimeZone("GMT")

        return dateFormat.parse(text).time
    }

    fun convertDateToString(datestamp: Long): String {
        val dateFormat = "yyyy-MM-dd hh:mm:ss.SSS"
        // Create a DateFormatter object for displaying date in specified format.
        @SuppressLint("SimpleDateFormat")
        val formatter = SimpleDateFormat(dateFormat)
        val cal = GregorianCalendar.getInstance()
        cal.timeInMillis = datestamp

        return formatter.format(cal.timeInMillis)
    }

    @TargetApi(Build.VERSION_CODES.N)
    fun getCurrentDateTime(): Date {
        return Calendar.getInstance().time
    }

    fun dismissKeyboard(windowToken: IBinder, activity: FragmentActivity?) {
        val imm = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        imm.hideSoftInputFromWindow(windowToken, 0)
    }

    @SuppressLint("SimpleDateFormat")
    fun convertTime(time: Long): String {
        val posedDate = time * 1000L
        val date = Date(posedDate)
        val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

        return format.format(date)
    }

    @SuppressLint("NewApi")
    fun getVersionNumber(): Int {
        val calendar = Calendar.getInstance()
        return calendar.get(Calendar.WEEK_OF_YEAR) * 100 + calendar.get(Calendar.YEAR)
    }

    fun areDrawablesIdentical(source: Drawable?, target: Drawable?): Boolean {
        source ?: return false
        target ?: return false

        val sourceState = source.constantState
        val targetState = target.constantState

        // If the constant state is identical, they are using the same drawable resource.
        // However, the opposite is not necessarily true.
        return sourceState == targetState || getBitmap(source).sameAs(getBitmap(target))
    }

    fun betterSmoothScrollToPosition(recyclerView: RecyclerView, targetItem: Int) {
        recyclerView.layoutManager?.apply {
            when (this) {
                is LinearLayoutManager -> {
                    val topItem = findFirstVisibleItemPosition()
                    val distance = topItem - targetItem
                    val anchorItem = when {
                        distance > MAX_SCROLL -> targetItem + MAX_SCROLL
                        distance < -MAX_SCROLL -> targetItem - MAX_SCROLL
                        else -> topItem
                    }

                    if (anchorItem != topItem) {
                        scrollToPosition(anchorItem)
                    }

                    recyclerView.post {
                        recyclerView.smoothScrollToPosition(targetItem)
                    }
                }
                is StaggeredGridLayoutManager -> {
                    val topItem = getFirstVisibleItem(findFirstVisibleItemPositions(null))

                    val distance = topItem - targetItem
                    val anchorItem = when {
                        distance > MAX_SCROLL -> targetItem + (MAX_SCROLL - 1)
                        distance < -MAX_SCROLL -> targetItem - (MAX_SCROLL - 1)
                        else -> topItem
                    }

                    if (anchorItem != topItem) {
                        scrollToPosition(anchorItem)
                    }

                    recyclerView.post {
                        recyclerView.smoothScrollToPosition(targetItem)
                    }
                }
                is GridLayoutManager -> {
                    val topItem = findFirstVisibleItemPosition()
                    val distance = topItem - targetItem
                    val anchorItem = when {
                        distance > MAX_SCROLL -> targetItem + MAX_SCROLL
                        distance < -MAX_SCROLL -> targetItem - MAX_SCROLL
                        else -> topItem
                    }

                    if (anchorItem != topItem) {
                        scrollToPosition(anchorItem)
                    }

                    recyclerView.post {
                        recyclerView.smoothScrollToPosition(targetItem)
                    }
                }
            }
        }
    }

    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }

    fun withDelay(delay : Long, block : () -> Unit) {
        Handler().postDelayed(Runnable(block), delay)
    }

    private fun getBitmap(drawable: Drawable): Bitmap {
        val result: Bitmap

        if (drawable is BitmapDrawable) {
            result = drawable.bitmap
        } else {
            var width = drawable.intrinsicWidth
            var height = drawable.intrinsicHeight
            // Some drawables have no intrinsic width - e.g. solid colours.
            if (width <= 0) {
                width = 1
            }

            if (height <= 0) {
                height = 1
            }

            result = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
            val canvas = Canvas(result)
            drawable.setBounds(0, 0, canvas.width, canvas.height)
            drawable.draw(canvas)
        }

        return result
    }

    internal fun getJson(activity: Activity, mock: String): String {
        val json: String
        val inputStream = activity.applicationContext.assets.open(mock)
        val buffer = ByteArray(inputStream.available())

        inputStream.read(buffer)
        inputStream.close()
        json = String(buffer)

        return json
    }

    fun getLastVisibleItem(lastVisibleItemPositions: IntArray): Int {
        var maxSize = 0
        for (i in lastVisibleItemPositions.indices) {
            if (i == 0) {
                maxSize = lastVisibleItemPositions[i]
            } else if (lastVisibleItemPositions[i] > maxSize) {
                maxSize = lastVisibleItemPositions[i]
            }
        }

        return maxSize
    }

    fun getFirstVisibleItem(firstVisibleItemPositions: IntArray): Int {
        var maxSize = 0
        for (i in firstVisibleItemPositions.indices) {
            if (i == 0) {
                maxSize = firstVisibleItemPositions[i]
            } else if (firstVisibleItemPositions[i] > maxSize) {
                maxSize = firstVisibleItemPositions[i]
            }
        }

        return maxSize
    }

    fun rand(from: Int, to: Int) : Int {
        return Random().nextInt(to - from) + from
    }

    fun removeLastCharRegex(text: String?): String? {
        return text?.replace(".$".toRegex(), "")
    }

    @Throws(IOException::class)
    fun getBitmapFromUri(context: Context, uri: Uri): Bitmap {
        val parcelFileDescriptor: ParcelFileDescriptor = context.contentResolver.openFileDescriptor(uri, "r")!!
        val fileDescriptor: FileDescriptor = parcelFileDescriptor.fileDescriptor
        val image: Bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor)

        parcelFileDescriptor.close()

        return image
    }

    @SuppressLint("NewApi")
    fun getPathFromUri(context: Context, uri: Uri): String? {
        // DocumentProvider
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                val docId = DocumentsContract.getDocumentId(uri)
                val split = docId.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                val type = split[0]

                if ("primary".equals(type, ignoreCase = true)) {
                    return context.externalMediaDirs.toString() + "/" + split[1]
                }

                // TODO handle non-primary volumes
            } else if (isDownloadsDocument(uri)) {
                val id = DocumentsContract.getDocumentId(uri)
                val contentUri = ContentUris.withAppendedId(
                    Uri.parse("content://downloads/public_downloads"), id.toLong())

                return getDataColumn(context, contentUri, null, null)
            } else if (isMediaDocument(uri)) {
                val docId = DocumentsContract.getDocumentId(uri)
                val split = docId.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                val type = split[0]

                var contentUri: Uri? = null
                when (type) {
                    "image" -> {
                        contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                    }
                    "video" -> {
                        contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                    }
                    "audio" -> {
                        contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
                    }
                }

                val selection = "_id=?"
                val selectionArgs = arrayOf(split[1])

                return contentUri?.let { getDataColumn(context, it, selection, selectionArgs) }
            }// MediaProvider
            // DownloadsProvider
        } else if ("content".equals(uri.scheme, ignoreCase = true)) {
            return getDataColumn(context, uri, null, null)
        } else if ("file".equals(uri.scheme, ignoreCase = true)) {
            return uri.path
        }// File
        // MediaStore (and general)

        return null
    }

    private fun getDataColumn(context: Context, uri: Uri, selection: String?, selectionArgs: Array<String>?): String? {
        var cursor: Cursor? = null
        val column = "_data"
        val projection = arrayOf(column)

        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor != null && cursor.moveToFirst()) {
                val columnIndex = cursor.getColumnIndexOrThrow(column)
                return cursor.getString(columnIndex)
            }
        } finally {
            cursor?.close()
        }

        return null
    }

    private fun isExternalStorageDocument(uri: Uri): Boolean {
        return "com.android.externalstorage.documents" == uri.authority
    }

    private fun isDownloadsDocument(uri: Uri): Boolean {
        return "com.android.providers.downloads.documents" == uri.authority
    }

    private fun isMediaDocument(uri: Uri): Boolean {
        return "com.android.providers.media.documents" == uri.authority
    }

    fun makeStatusNotification(context: Context, msg: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = VERBOSE_NOTIFICATION_CHANNEL_NAME
            val description = VERBOSE_NOTIFICATION_CHANNEL_DESCRIPTION
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel(CHANNEL_ID, name, importance)

            channel.description = description

            val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager?

            notificationManager?.createNotificationChannel(channel)
        }

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(NOTIFICATION_TITLE)
            .setContentText(msg)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setVibrate(LongArray(0))

        NotificationManagerCompat.from(context).notify(NOTIFICATION_ID, builder.build())
    }
}