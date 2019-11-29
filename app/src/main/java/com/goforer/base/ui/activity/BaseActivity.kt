/*
 * Copyright 2019 Lukoh Nam, goForer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 */

package com.goforer.base.ui.activity

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.IdRes
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.goforer.base.common.utils.CommonUtils
import com.goforer.base.common.utils.CommonUtils.getVersionNumber
import com.goforer.base.common.utils.ConnectionUtils
import com.goforer.base.common.utils.IntegerVersionSignature
import com.goforer.base.ui.action.ActivityStackClearEvent
import com.goforer.sotong.R
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.regex.Pattern
import javax.inject.Inject

abstract class BaseActivity: AppCompatActivity(), HasAndroidInjector {
    private var isResumed = false

    private var width = 0
    private var height = 0

    private lateinit var glideRequestManager: RequestManager

    /**
     * Return currently set Activity
     *
     * @return The currently set Activity
     */
    private var currentActivity: Activity? = null

    private var newFragment: Fragment? = null

    private var activeFragment: Fragment? = null

    /**
     * Check if the network is available
     *
     * @return return true if the network is available
     */
    internal var isNetworkAvailable = false

    internal var photo: Bitmap? = null

    internal var photoWidth = 0
    internal var photoHeight = 0

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    companion object {
        internal const val NOTO_SANS_KR_BOLD = "fonts/NotoSansKR-Bold-Hestia.otf"
        internal const val NOTO_SANS_KR_MEDIUM = "fonts/NotoSansKR-Medium-Hestia.otf"
        internal const val NOTO_SANS_KR_REGULAR = "fonts/NotoSansKR-Regular-Hestia.otf"

        internal const val FONT_TYPE_BOLD = 0
        internal const val FONT_TYPE_MEDIUM = 1
        internal const val FONT_TYPE_REGULAR = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        currentActivity = this
        EventBus.getDefault().register(this)
        @GlideModule
        glideRequestManager = Glide.with(this)
        setContentView()
        setActionBar()
        if (ConnectionUtils.isNetworkAvailable(this)) {
            isNetworkAvailable = true
            setViews(savedInstanceState)
        } else {
            isNetworkAvailable = false
        }
    }

    public override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()

        isResumed = true
    }

    override fun onPause() {
        super.onPause()

        isResumed = false

    }

    override fun onDestroy() {
        EventBus.getDefault().unregister(this)

        super.onDestroy()
    }

    override fun androidInjector() = dispatchingAndroidInjector

    /**
     * Return true if this activity is resumed
     *
     * @return true if this activity is resumed
     */
    fun resumed(): Boolean {
        return isResumed
    }

    /**
     * Initialize the ActionBar and set options into it.
     *
     * @see ActionBar
     */
    protected open fun setActionBar() {
        val actionBar = supportActionBar

        actionBar?.displayOptions = ActionBar.DISPLAY_HOME_AS_UP or ActionBar.DISPLAY_SHOW_TITLE
    }

    /**
     * Set the activity content from a layout resource.  The resource will be
     * inflated, adding all top-level views to the activity.
     *
     *
     * All activity must implement this method to get the resource inflated like below example:
     *
     * Example :
     * @@Override
     * public void setContentView() {
     * setContentView(R.layout.activity_gallery);
     * }
     *
     *
     * @see .setContentView
     */
    protected abstract fun setContentView()

    /**
     * Initialize all views to set into the activity.
     *
     *
     * The activity which has no Fragment must override this method to set all views
     * into the activity.
     *
     *
     * @param savedInstanceState If the activity is being re-initialized after
     * previously being shut down then this Bundle contains the data it most
     * recently supplied in [.onSaveInstanceState].  ***Note: Otherwise it is null.***
     */
    protected open fun setViews(savedInstanceState: Bundle?) {}

    /**
     * Add a new fragment that is added a fragment to the activity state and hides an existing fragment,
     * shows a previously hidden fragment or new fragment
     *
     * @param cls the component class that is to be used for BaseActivity
     * @param containerViewId Identifier of the container whose fragment(s) are to be replaced.
     */
    protected fun transactFragment(cls: Class<*>, @IdRes containerViewId: Int): Fragment? {
        val fragmentManager = supportFragmentManager
        val ft = fragmentManager.beginTransaction()
        var allowAddition = true

        newFragment = fragmentManager.findFragmentByTag(cls.name)
        newFragment?.let {
            allowAddition = false
        }

        newFragment = newFragment ?: fragmentManager.fragmentFactory.instantiate(cls.classLoader!!, cls.name)
        activeFragment = activeFragment ?: newFragment
        newFragment?.let {
            if (allowAddition) {
                ft.add(containerViewId, it, cls.name).hide(activeFragment!!).show(newFragment!!).commit()
            } else {
                ft.hide(activeFragment!!).show(newFragment!!).commit()
            }

            activeFragment = newFragment
        }

        return newFragment
    }

    /**
     * Replace an existing fragment that was add to a container or add a new fragment that is added
     * a fragment to the activity state.
     *
     * @param cls the component class that is to be used for BaseActivity
     * @param containerViewId Identifier of the container whose fragment(s) are to be replaced.
     * @param allowAddition Add a fragment to the activity state if allowAddition is true
     *                      Replace an existing fragment that was add to a container if allowAddition is false
     */
    internal fun transactFragment(cls: Class<*>, @IdRes containerViewId: Int, allowAddition: Boolean) {
        if (!isFinishing) {
            val fragmentManager = supportFragmentManager
            val ft = fragmentManager.beginTransaction()
            var fragment = fragmentManager.findFragmentByTag(cls.name)

            fragment = fragment ?: fragmentManager.fragmentFactory.instantiate(cls.classLoader!!, cls.name)
            if (allowAddition) {
                ft.add(containerViewId, fragment, cls.name)
            } else {
                ft.replace(containerViewId, fragment, cls.name)
            }

            if (cls.name.contains("FeedSearchFragment") || cls.name.contains("RecentKeywordFragment")) {
                ft.addToBackStack(null)
            }

            ft.commitAllowingStateLoss()
        }
    }

    /**
     * Sets the typeface and style in which the text should be displayed
     *
     * @param view the AppCompatTextView in which should be set the typeface
     * @param type the Font type
     *
     */
    internal fun setFontTypeface(view: TextView, type: Int) {
        when(type) {
            FONT_TYPE_BOLD -> {
                view.typeface = Typeface.createFromAsset(currentActivity?.applicationContext?.assets, NOTO_SANS_KR_BOLD)
            }

            FONT_TYPE_MEDIUM -> {
                view.typeface = Typeface.createFromAsset(currentActivity?.applicationContext?.assets, NOTO_SANS_KR_MEDIUM)
            }

            FONT_TYPE_REGULAR -> {
                view.typeface = Typeface.createFromAsset(currentActivity?.applicationContext?.assets, NOTO_SANS_KR_REGULAR)
            }
        }
    }

    /**
     * Sets the typeface and style in which the text should be displayed
     *
     * @param view the AppCompatTextView in which should be set the typeface
     * @param type the Font type
     *
     */
    internal fun setFontTypeface(view: AppCompatTextView, type: Int) {
        when(type) {
            FONT_TYPE_BOLD -> {
                view.typeface = Typeface.createFromAsset(currentActivity?.applicationContext?.assets, NOTO_SANS_KR_BOLD)
            }

            FONT_TYPE_MEDIUM -> {
                view.typeface = Typeface.createFromAsset(currentActivity?.applicationContext?.assets, NOTO_SANS_KR_MEDIUM)
            }

            FONT_TYPE_REGULAR -> {
                view.typeface = Typeface.createFromAsset(currentActivity?.applicationContext?.assets, NOTO_SANS_KR_REGULAR)
            }
        }
    }

    /**
     * Sets the typeface and style in which the text should be displayed
     *
     * @param view the AppCompatTextView in AppCompatButton in which should be set the typeface
     * @param type the Font type
     *
     */
    internal fun setFontTypeface(view: AppCompatButton, type: Int) {
        when(type) {
            FONT_TYPE_BOLD -> {
                view.typeface = Typeface.createFromAsset(currentActivity?.applicationContext?.assets, NOTO_SANS_KR_BOLD)
            }

            FONT_TYPE_MEDIUM -> {
                view.typeface = Typeface.createFromAsset(currentActivity?.applicationContext?.assets, NOTO_SANS_KR_MEDIUM)
            }

            FONT_TYPE_REGULAR -> {
                view.typeface = Typeface.createFromAsset(currentActivity?.applicationContext?.assets, NOTO_SANS_KR_REGULAR)
            }
        }
    }

    /**
     * Sets the fixed with and height to the AppCompatImageView
     *
     * @param height the fixed height
     * @param width the fixed width
     *
     */
    internal fun setFixedImageSize(width: Int, height: Int) {
        this.height = height
        this.width = width
    }

    internal fun setImageDraw(view: AppCompatImageView, layout: ConstraintLayout, path: String, skipCache: Boolean) {
        val set = ConstraintSet()

        val options = if (skipCache) {
            RequestOptions
                .fitCenterTransform()
                .placeholder(R.color.colorDefaultDrawable)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .skipMemoryCache(true)
                .signature(IntegerVersionSignature(getVersionNumber()))

        } else {
            RequestOptions
                .fitCenterTransform()
                .placeholder(R.color.colorDefaultDrawable)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .signature(IntegerVersionSignature(getVersionNumber()))
        }

        glideRequestManager
            .asBitmap()
            .load(path)
            .apply(options)
            .thumbnail(0.5f)
            .listener(object: RequestListener<Bitmap> {
                override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Bitmap>?,
                                          isFirstResource: Boolean): Boolean {
                    return false
                }

                override fun onResourceReady(resource: Bitmap?, model: Any?, target: Target<Bitmap>?,
                                             dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                    val ratio = if (width != 0) {
                        String.format("%d:%d", width, height)
                    } else {
                        String.format("%d:%d", resource?.width!!, resource.height)
                    }

                    photoWidth = resource?.width!!
                    photoHeight = resource.height

                    photo = resource
                    set.clone(layout)
                    set.setDimensionRatio(view.id, ratio)
                    set.applyTo(layout)
                    view.setImageBitmap(resource)

                    return false
                }
            })
            .submit()
    }

    /**
     * Draw the photo as Bitmap-Format into the given AppCompatImageView
     *
     * @param view the AppCompatImageView which is provided to be drawn the bitmap
     * @param layout the ConstraintLayout to which is applied the constraints
     * @param bitmap the bitmap to be drawn in the AppCompatImageView
     * @param skipCache True to allow the resource to skip the memory cache
     *
     */
    internal fun setImageDraw(view: AppCompatImageView, layout: ConstraintLayout, bitmap: Bitmap, skipCache: Boolean) {
        val set = ConstraintSet()

        val options = if (skipCache) {
            RequestOptions
                .fitCenterTransform()
                .fitCenter()
                .override(width, height)
                .placeholder(R.color.colorDefaultDrawable)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .skipMemoryCache(true)
                .signature(IntegerVersionSignature(getVersionNumber()))

        } else {
            RequestOptions
                .fitCenterTransform()
                .fitCenter()
                .override(width, height)
                .placeholder(R.color.colorDefaultDrawable)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .signature(IntegerVersionSignature(getVersionNumber()))
        }

        glideRequestManager
            .asBitmap()
            .load(bitmap)
            .apply(options)
            .thumbnail(0.5f)
            .listener(object: RequestListener<Bitmap> {
                override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Bitmap>?,
                                          isFirstResource: Boolean): Boolean {
                    return false
                }

                override fun onResourceReady(resource: Bitmap?, model: Any?, target: Target<Bitmap>?,
                                             dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                    val ratio = if (width != 0) {
                        String.format("%d:%d", width, height)
                    } else {
                        String.format("%d:%d", resource?.width!!, resource.height)
                    }

                    photoWidth = resource?.width!!
                    photoHeight = resource.height

                    photo = resource
                    set.clone(layout)
                    set.setDimensionRatio(view.id, ratio)
                    set.applyTo(layout)
                    view.setImageBitmap(resource)

                    return false
                }
            })
            .submit()
    }

    /**
     * Draw the photo as Bitmap-Format into the given AppCompatImageView
     *
     * @param view the AppCompatImageView which is provided to be drawn the bitmap
     * @param url the url of photo to be loaded into the AppCompatImageView
     *
     */
    internal fun setImageDraw(view: AppCompatImageView, url: String) {
        val options = RequestOptions
            .fitCenterTransform()
            .placeholder(R.color.colorDefaultDrawable)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .skipMemoryCache(true)
            .signature(IntegerVersionSignature(getVersionNumber()))

        glideRequestManager
            .asBitmap()
            .load(url)
            .apply(options)
            .thumbnail(0.5f)
            .listener(object: RequestListener<Bitmap> {
                override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Bitmap>?,
                                          isFirstResource: Boolean): Boolean {
                    return false
                }

                override fun onResourceReady(resource: Bitmap?, model: Any?, target: Target<Bitmap>?,
                                             dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                    view.setImageBitmap(resource)

                    return false
                }
            })
            .submit()
    }

    internal fun setSpan(activity: BaseActivity, textView: TextView, description: String) {
        val spannable = SpannableString(description)
        val matcher = Pattern.compile("#\\s*(\\w+)").matcher(description)

        setFontTypeface(textView, FONT_TYPE_REGULAR)
        while (matcher.find()) {
            val tag = matcher.group(1)
            val clickableSpan = object : ClickableSpan() {
                override fun onClick(textView: View) {
                    CommonUtils.showToastMessage(activity, "Will be implemented...", Toast.LENGTH_SHORT)
                }

                override fun updateDrawState(ds: TextPaint) {
                    super.updateDrawState(ds)
                    ds.isUnderlineText = false
                    ds.color = activity.resources.getColor(R.color.colorHashTag, null)
                    ds.typeface = Typeface.createFromAsset(activity.applicationContext?.assets, NOTO_SANS_KR_BOLD)
                }
            }

            val tagIndex = description.indexOf(tag!!) - 1

            spannable.setSpan(clickableSpan, tagIndex, tagIndex + tag.length + 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        textView.text = spannable
        textView.movementMethod = LinkMovementMethod.getInstance()
    }

    /**
     * Return previously set Fragment with given the component class.
     *
     * @param cls The previously set the component class that is to be used for BaseActivity.
     *
     * @return The previously set Fragment
     */
    protected fun getFragment(cls: Class<*>): Fragment? {
        val fragmentManager = supportFragmentManager

        return fragmentManager.findFragmentByTag(cls.name)
    }

    /**
     * Return previously set Fragment with given the tag.
     *
     * @param tag The previously set the component class tag that is to be used for BaseActivity.
     *
     * @return The previously set Fragment
     */
    protected fun getFragment(tag: String): Fragment? {
        val fragmentManager = supportFragmentManager

        return fragmentManager.findFragmentByTag(tag)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                supportFinishAfterTransition()

                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    open fun onEvent(event: ActivityStackClearEvent) {
        finish()
    }
}