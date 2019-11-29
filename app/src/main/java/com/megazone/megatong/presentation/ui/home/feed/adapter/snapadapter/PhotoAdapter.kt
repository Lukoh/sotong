package com.megazone.megatong.presentation.ui.home.feed.adapter.snapadapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.megazone.base.ui.activity.BaseActivity
import com.megazone.base.ui.holder.BaseViewHolder
import com.megazone.megatong.R
import com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed.Photo
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.snap_photo_item.*

class PhotoAdapter(private val activity: BaseActivity): RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {
    private var items: List<Photo> = ArrayList()

    companion object {
        private const val PHOTO_RATIO_WIDTH = 344
        private const val PHOTO_RATIO_HEIGHT = 192
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.snap_photo_item, parent, false)

        return ViewHolder( view, activity)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItemHolder(holder, items[position], position)
    }

    override fun getItemId(position: Int): Long {
        return items[position].id.hashCode().toLong()
    }

    internal fun addItem(items: List<Photo>) {
        this.items = items
    }

    class ViewHolder(override val containerView: View, private val activity: BaseActivity): BaseViewHolder<Photo>(containerView), LayoutContainer {
        @SuppressLint("SetTextI18n")
        @Suppress("UNCHECKED_CAST")
        override fun bindItemHolder(holder: BaseViewHolder<Photo>, item: Photo, position: Int) {
            // In case of applying transition effect to views, have to use findViewById method
            activity.setFixedImageSize(PHOTO_RATIO_WIDTH, PHOTO_RATIO_HEIGHT)
            activity.setImageDraw(iv_snap_photo, snap_photo_constraintLayoutContainer, item.photo, false)
        }

        override fun onItemSelected() {
        }

        override fun onItemClear() {
            containerView.setBackgroundColor(0)
        }
    }
}