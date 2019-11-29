package com.goforer.sotong.presentation.ui.profile.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.net.Uri
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper
import com.goforer.base.ui.activity.BaseActivity
import com.goforer.base.ui.holder.BaseViewHolder
import com.goforer.sotong.R
import com.goforer.sotong.data.datasource.model.cache.entity.feed.Feed
import com.goforer.sotong.presentation.ui.home.feed.adapter.snapadapter.PhotoAdapter
import com.goforer.sotong.presentation.ui.profile.fragment.ProfileFragment
import com.mikepenz.materialdrawer.view.BezelImageView
import im.ene.toro.ToroPlayer
import im.ene.toro.ToroUtil
import im.ene.toro.exoplayer.ExoPlayerViewHelper
import im.ene.toro.media.PlaybackInfo
import im.ene.toro.widget.Container
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.list_feed_photo_item.view.*
import kotlinx.android.synthetic.main.list_feed_plain_item.view.*
import kotlinx.android.synthetic.main.list_feed_video_item.*
import kotlinx.android.synthetic.main.list_feed_video_item.view.*
import kotlinx.android.synthetic.main.recycler_view_container.view.*

class ProfileFeedAdapter(private val fragment: ProfileFragment): PagedListAdapter<Feed, BaseViewHolder<Feed>>(DIFF_CALLBACK),
    GravitySnapHelper.SnapListener {
    companion object {
        private const val MEDIA_PHOTO_TYPE = "photo"
        private const val MEDIA_VIDEO_TYPE = "video"

        private const val PLAIN_TYPE = 0
        private const val PHOTO_TYPE = 1
        private const val VIDEO_TYPE = 2

        private const val FEED_RANKING_NONE = 0
        private const val FEED_RANKING_FIRST = 1
        private const val FEED_RANKING_SECOND = 2
        private const val FEED_RANKING_THIRD = 3

        private val PAYLOAD_TITLE = Any()

        private val DIFF_CALLBACK = object: DiffUtil.ItemCallback<Feed>() {
            override fun areItemsTheSame(oldFeed: Feed, newFeed: Feed): Boolean =
                oldFeed.id ==  newFeed.id

            override fun areContentsTheSame(oldFeed: Feed, newFeed: Feed): Boolean =
                oldFeed ==  newFeed

            override fun getChangePayload(oldFeed: Feed, newFeed: Feed): Any? {
                return if (sameExceptTitle(oldFeed, newFeed)) {
                    PAYLOAD_TITLE
                } else {
                    null
                }
            }
        }

        private fun sameExceptTitle(oldFeed: Feed, newFeed: Feed): Boolean {
            return oldFeed.copy(description = newFeed.description) == newFeed
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)?.media) {
            MEDIA_PHOTO_TYPE -> PHOTO_TYPE
            MEDIA_VIDEO_TYPE -> VIDEO_TYPE
            else -> PLAIN_TYPE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Feed> {
        val holder: BaseViewHolder<Feed>
        val inflater = LayoutInflater.from(parent.context.applicationContext)

        when(viewType) {
            PHOTO_TYPE -> {
                val view = inflater.inflate(R.layout.list_feed_photo_item, parent, false)

                holder = ProfilePhotoFeedHolder(view, this, RecyclerView.RecycledViewPool())
            }

            VIDEO_TYPE -> {
                val view = inflater.inflate(R.layout.list_feed_video_item, parent, false)

                holder = HomeVideoFeedHolder(view, this)
            }

            PLAIN_TYPE -> {
                val view = inflater.inflate(R.layout.list_feed_plain_item, parent, false)

                holder = ProfilePlainFeedHolder(view, this)
            }

            else -> {
                val view = inflater.inflate(R.layout.list_feed_plain_item, parent, false)

                holder = ProfilePlainFeedHolder(view, this)
            }
        }

        return holder
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Feed>, position: Int) {
        val item = getItem(position)

        item?.let {
            holder.bindItemHolder(holder, it, position)
        }
    }

    override fun getItemId(position: Int): Long {
        return getItem(position)?.id.hashCode().toLong()
    }

    override fun onSnap(position: Int) {}

    internal fun setVisible(view1: View, view2: View, view3: View, view4: View, isVisible: Boolean) {
        if (isVisible) {
            view1.visibility = View.VISIBLE
            view2.visibility = View.VISIBLE
            view3.visibility = View.VISIBLE
            view4.visibility = View.VISIBLE
        } else {
            view1.visibility = View.GONE
            view2.visibility = View.GONE
            view3.visibility = View.GONE
            view4.visibility = View.GONE
        }
    }

    internal fun remove(view: View, feedId: String) {
        view.setOnClickListener {
            fragment.deleteFeed(feedId)
        }
    }

    internal fun edit(view: View, feedId: String) {
        view.setOnClickListener {
            fragment.editFeed(feedId)
        }
    }

    internal fun setUserPic(picPath: String?, view: BezelImageView) {
        picPath ?: fragment.setUserPic(view)
        picPath?.let {
            if (picPath == "") {
                fragment.setUserPic(view)
            } else {
                fragment.profileActivity.setImageDraw(view, it)
            }
        }
    }

    class ProfilePhotoFeedHolder(override val containerView: View, private val adapter: ProfileFeedAdapter,
                              private val viewPool: RecyclerView.RecycledViewPool): BaseViewHolder<Feed>(containerView),
        LayoutContainer {
        @SuppressLint("SetTextI18n")
        override fun bindItemHolder(holder: BaseViewHolder<Feed>, item: Feed, position: Int) {
            with(containerView) {
                rv_photo_item_photos.setRecycledViewPool(viewPool)
                adapter.fragment.profileActivity.setFontTypeface(tv_photo_item_user_name,
                    BaseActivity.FONT_TYPE_BOLD
                )
                adapter.fragment.profileActivity.setFontTypeface(tv_photo_item_email_id,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                adapter.fragment.profileActivity.setFontTypeface(tv_photo_item_delete,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                adapter.fragment.profileActivity.setFontTypeface(tv_photo_item_edit,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                tv_photo_item_user_name.requestLayout()
                tv_photo_item_email_id.requestLayout()
                tv_photo_item_description.requestLayout()
                rv_photo_item_photos.setPadding(4, 0, 4, 0)
                attachToRecyclerView(rv_photo_item_photos)
                val photoAdapter = PhotoAdapter(adapter.fragment.profileActivity)

                if (item.photos?.isNotEmpty()!!) {
                    rv_photo_item_photos.visibility = View.VISIBLE
                } else {
                    rv_photo_item_photos.visibility = View.GONE
                }

                photoAdapter.setHasStableIds(true)
                photoAdapter.addItem(item.photos)
                rv_photo_item_photos.adapter = photoAdapter
                indicator.setMaxCount(item.photos.size)
                indicator.setDefaultColor(containerView.resources.getColor(R.color.blackLBrightLight, null))
                indicator.setSelectedColor(containerView.resources.getColor(R.color.colorPrimary, null))
                indicator.setSize((containerView.resources.getDimension(R.dimen.size_8) / containerView.resources.displayMetrics.density).toInt())
                indicator.setSpacing((containerView.resources.getDimension(R.dimen.space_8) / containerView.resources.displayMetrics.density).toInt())
                indicator.attachTo(rv_photo_item_photos)
                adapter.setUserPic(item.user.photo, iv_photo_item_user)
                if (item.user.name == "") {
                    tv_photo_item_user_name.text = containerView.resources.getString(R.string.no_name)
                } else {
                    tv_photo_item_user_name.text = item.user.name
                }

                if (item.user.email == "") {
                    tv_photo_item_email_id.text = containerView.resources.getString(R.string.no_id)
                } else {
                    tv_photo_item_email_id.text = item.user.email
                }

                when(item.ranking) {
                    FEED_RANKING_NONE -> {
                        iv_photo_item_badge.visibility = View.GONE
                    }

                    FEED_RANKING_FIRST -> {
                        iv_photo_item_badge.setImageDrawable(resources.getDrawable(R.drawable.ic_icon_rank_01, null))
                        iv_photo_item_badge.visibility = View.VISIBLE
                    }

                    FEED_RANKING_SECOND -> {
                        iv_photo_item_badge.setImageDrawable(resources.getDrawable(R.drawable.ic_icon_rank_02, null))
                        iv_photo_item_badge.visibility = View.VISIBLE
                    }

                    FEED_RANKING_THIRD -> {
                        iv_photo_item_badge.setImageDrawable(resources.getDrawable(R.drawable.ic_icon_rank_03, null))
                        iv_photo_item_badge.visibility = View.VISIBLE
                    }
                }

                tv_photo_item_like_count.text = item.likes.toString()
                adapter.fragment.profileActivity.setSpan(adapter.fragment.profileActivity, tv_photo_item_description, item.description)
                if (adapter.fragment.profileActivity.userId == item.user.id) {
                    adapter.setVisible(iv_photo_item_edit, tv_photo_item_edit, iv_photo_item_delete, tv_photo_item_delete, true)
                } else {
                    adapter.setVisible(iv_photo_item_edit, tv_photo_item_edit, iv_photo_item_delete, tv_photo_item_delete, false)
                }

                adapter.edit(iv_photo_item_edit, item.id)
                adapter.edit(tv_photo_item_edit, item.id)
                adapter.remove(iv_photo_item_delete, item.id)
                adapter.remove(tv_photo_item_delete, item.id)

                if (holder.view.swipe_layout.isRefreshing) {
                    adapter.fragment.stopRefresh()
                }
            }

        }

        override fun onItemSelected() {
            containerView.setBackgroundColor(Color.LTGRAY)
        }

        override fun onItemClear() {
            containerView.setBackgroundColor(0)
        }

        private fun attachToRecyclerView(recyclerView: RecyclerView) {
            recyclerView.setHasFixedSize(true)
            recyclerView.setItemViewCacheSize(4)
            recyclerView.layoutManager = LinearLayoutManager(recyclerView.context, RecyclerView.HORIZONTAL, false)
            GravitySnapHelper(Gravity.START, false, adapter).attachToRecyclerView(recyclerView)
        }
    }

    class ProfilePlainFeedHolder(override val containerView: View, private val adapter: ProfileFeedAdapter): BaseViewHolder<Feed>(containerView),
        LayoutContainer {
        @SuppressLint("SetTextI18n")
        override fun bindItemHolder(holder: BaseViewHolder<Feed>, item: Feed, position: Int) {
            with(containerView) {
                adapter.fragment.profileActivity.setFontTypeface(tv_plain_item_user_name,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                adapter.fragment.profileActivity.setFontTypeface(tv_plain_item_email_id,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                adapter.fragment.profileActivity.setFontTypeface(tv_plain_item_delete,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                adapter.fragment.profileActivity.setFontTypeface(tv_plain_item_edit,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                tv_plain_item_user_name.requestLayout()
                tv_plain_item_email_id.requestLayout()
                tv_plain_item_description.requestLayout()
                adapter.setUserPic(item.user.photo, iv_plain_item_user)
                if (item.user.name == "") {
                    tv_plain_item_user_name.text = containerView.resources.getString(R.string.no_name)
                } else {
                    tv_plain_item_user_name.text = item.user.name
                }

                if (item.user.email == "") {
                    tv_plain_item_email_id.text = containerView.resources.getString(R.string.no_id)
                } else {
                    tv_plain_item_email_id.text = item.user.email
                }

                when(item.ranking) {
                    FEED_RANKING_NONE -> {
                        iv_plain_item_badge.visibility = View.GONE
                    }

                    FEED_RANKING_FIRST -> {
                        iv_plain_item_badge.setImageDrawable(resources.getDrawable(R.drawable.ic_icon_rank_01, null))
                        iv_plain_item_badge.visibility = View.VISIBLE
                    }

                    FEED_RANKING_SECOND -> {
                        iv_plain_item_badge.setImageDrawable(resources.getDrawable(R.drawable.ic_icon_rank_02, null))
                        iv_plain_item_badge.visibility = View.VISIBLE
                    }

                    FEED_RANKING_THIRD -> {
                        iv_plain_item_badge.setImageDrawable(resources.getDrawable(R.drawable.ic_icon_rank_03, null))
                        iv_plain_item_badge.visibility = View.VISIBLE
                    }
                }

                tv_plain_item_like_count.text = item.likes.toString()
                adapter.fragment.profileActivity.setSpan(adapter.fragment.profileActivity, tv_plain_item_description, item.description)
                if (adapter.fragment.profileActivity.userId == item.user.id) {
                    adapter.setVisible(iv_plain_item_edit, tv_plain_item_edit, iv_plain_item_delete, tv_plain_item_delete, true)
                } else {
                    adapter.setVisible(iv_plain_item_edit, tv_plain_item_edit, iv_plain_item_delete, tv_plain_item_delete, false)
                }

                adapter.edit(iv_plain_item_edit, item.id)
                adapter.edit(tv_plain_item_edit, item.id)
                adapter.remove(iv_plain_item_delete, item.id)
                adapter.remove(tv_plain_item_delete, item.id)

                if (holder.view.swipe_layout.isRefreshing) {
                    adapter.fragment.stopRefresh()
                }
            }
        }

        override fun onItemSelected() {
            containerView.setBackgroundColor(Color.LTGRAY)
        }

        override fun onItemClear() {
            containerView.setBackgroundColor(0)
        }
    }

    class HomeVideoFeedHolder(override val containerView: View, private val adapter: ProfileFeedAdapter): BaseViewHolder<Feed>(containerView), LayoutContainer,
        ToroPlayer {
        private var helper: ExoPlayerViewHelper? = null

        private var feed: Feed? = null

        override fun isPlaying(): Boolean {
            return helper != null && helper?.isPlaying!!
        }

        @Suppress("PLUGIN_WARNING")
        override fun getPlayerView(): View {
            return player_view
        }

        override fun pause() {
            helper?.pause()
        }

        override fun wantsToPlay(): Boolean {
            return ToroUtil.visibleAreaOffset(this, itemView.parent) >= 0.85
        }

        override fun play() {
            helper?.play()
        }

        override fun getCurrentPlaybackInfo(): PlaybackInfo {
            return if (helper != null) helper?.latestPlaybackInfo!! else PlaybackInfo()
        }

        override fun release() {
            helper?.apply {
                helper?.release()
                helper = null
            }
        }

        override fun initialize(container: Container, playbackInfo: PlaybackInfo) {
            helper = helper ?: ExoPlayerViewHelper(this, Uri.parse(feed?.video?.url))

            helper?.initialize(container, playbackInfo)
        }

        override fun getPlayerOrder(): Int {
            return adapterPosition
        }

        @SuppressLint("SetTextI18n")
        override fun bindItemHolder(holder: BaseViewHolder<Feed>, item: Feed, position: Int) {
            feed = item

            with(containerView) {
                adapter.fragment.profileActivity.setFontTypeface(tv_video_item_user_name,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                adapter.fragment.profileActivity.setFontTypeface(tv_video_item_email_id,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                adapter.fragment.profileActivity.setFontTypeface(tv_video_item_delete,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                adapter.fragment.profileActivity.setFontTypeface(tv_video_item_edit,
                    BaseActivity.FONT_TYPE_MEDIUM
                )
                tv_video_item_user_name.requestLayout()
                tv_video_item_email_id.requestLayout()
                tv_video_item_description.requestLayout()
                adapter.setUserPic(item.user.photo, iv_video_item_user)
                if (item.user.name == "") {
                    tv_video_item_user_name.text = containerView.resources.getString(R.string.no_name)
                } else {
                    tv_video_item_user_name.text = item.user.name
                }

                if (item.user.email == "") {
                    tv_video_item_email_id.text = containerView.resources.getString(R.string.no_id)
                } else {
                    tv_video_item_email_id.text = item.user.email
                }

                when(item.ranking) {
                    FEED_RANKING_NONE -> {
                        iv_video_item_badge.visibility = View.GONE
                    }

                    FEED_RANKING_FIRST -> {
                        iv_video_item_badge.setImageDrawable(resources.getDrawable(R.drawable.ic_icon_rank_01, null))
                        iv_video_item_badge.visibility = View.VISIBLE
                    }

                    FEED_RANKING_SECOND -> {
                        iv_video_item_badge.setImageDrawable(resources.getDrawable(R.drawable.ic_icon_rank_02, null))
                        iv_video_item_badge.visibility = View.VISIBLE
                    }

                    FEED_RANKING_THIRD -> {
                        iv_video_item_badge.setImageDrawable(resources.getDrawable(R.drawable.ic_icon_rank_03, null))
                        iv_video_item_badge.visibility = View.VISIBLE
                    }
                }

                tv_video_item_like_count.text = item.likes.toString()
                adapter.fragment.profileActivity.setSpan(adapter.fragment.profileActivity, tv_video_item_description, item.description)
                if (adapter.fragment.profileActivity.userId == item.user.id) {
                    adapter.setVisible(iv_video_item_edit, tv_video_item_edit, iv_video_item_delete, tv_video_item_delete, true)
                } else {
                    adapter.setVisible(iv_video_item_edit, tv_video_item_edit, iv_video_item_delete, tv_video_item_delete, false)
                }

                adapter.edit(iv_video_item_edit, item.id)
                adapter.edit(tv_video_item_edit, item.id)
                adapter.remove(iv_video_item_delete, item.id)
                adapter.remove(tv_video_item_delete, item.id)

                if (holder.view.swipe_layout.isRefreshing) {
                    adapter.fragment.stopRefresh()
                }
            }
        }

        override fun onItemSelected() {
            containerView.setBackgroundColor(Color.LTGRAY)
        }

        override fun onItemClear() {
            containerView.setBackgroundColor(0)
        }
    }
}