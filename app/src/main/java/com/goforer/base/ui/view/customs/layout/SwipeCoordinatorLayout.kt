/*
 * Copyright (C)  2015 - 2019 Lukoh Nam, goForer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.goforer.base.ui.view.customs.layout

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.goforer.base.ui.activity.BaseActivity
import timber.log.Timber
import kotlin.math.abs

/**
 * SwipeCoordinatorLayout detect when user is trying to swipe out of bounds
 */
class SwipeCoordinatorLayout @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null): CoordinatorLayout(context, attrs) {
    private var startDragX: Float = 0.toFloat()
    private var startDragY: Float = 0.toFloat()

    private lateinit var listener: OnSwipeOutListener

    private lateinit var activity: BaseActivity

    companion object {
        private const val SWIPE_THRESHOLD_VELOCITY_X = 250f
        private const val SWIPE_THRESHOLD_VELOCITY_Y = 50f
    }

    interface OnSwipeOutListener {
        fun onSwipeLeft(x: Float, y: Float)

        fun onSwipeRight(x: Float, y: Float)

        fun onSwipeDown(x: Float, y: Float)

        fun onSwipeUp(x: Float, y: Float)

        fun onSwipeDone()
    }

    fun setOnSwipeOutListener(activity: BaseActivity, listener: OnSwipeOutListener) {
        this.listener = listener
        this.activity = activity
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        val action= ev.actionMasked
        val x= ev.x
        val y= ev.y

        when (action) {
            MotionEvent.ACTION_DOWN -> {
                startDragX = ev.x
                startDragY = ev.y
            }

            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                listener.onSwipeDone()
            }

            MotionEvent.ACTION_SCROLL -> {
            }

            MotionEvent.ACTION_MOVE -> {
                val distanceY = y - startDragY
                val distanceX = x - startDragX

                if (abs(distanceY) > abs(distanceX)) {
                    if (distanceY < 0 && abs(distanceY) > SWIPE_THRESHOLD_VELOCITY_Y) {
                        Timber.e("onInterceptTouchEvent : ACTION_MOVE = onSwipeUp")

                        listener.onSwipeUp(x, y)

                    } else if (abs(distanceY) > SWIPE_THRESHOLD_VELOCITY_Y) {
                        Timber.e("onInterceptTouchEvent : ACTION_MOVE = onSwipeDown")

                        listener.onSwipeDown(x, y)
                    }
                } else {
                    if (distanceX > 0 && abs(distanceX) > SWIPE_THRESHOLD_VELOCITY_X) {
                        Timber.e("onInterceptTouchEvent : ACTION_MOVE = onSwipeRight")

                        listener.onSwipeRight(x, y)
                    } else if (abs(distanceX) > SWIPE_THRESHOLD_VELOCITY_X) {
                        Timber.e("onInterceptTouchEvent : ACTION_MOVE = onSwipeLeft")

                        listener.onSwipeLeft(x, y)
                    }
                }
            }
        }

        return super.onInterceptTouchEvent(ev)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(ev: MotionEvent): Boolean {
        val action= ev.actionMasked
        val x= ev.x
        val y= ev.y

        when (action) {
            MotionEvent.ACTION_DOWN -> {
                startDragX = ev.x
                startDragY = ev.y
            }

            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                listener.onSwipeDone()
            }

            MotionEvent.ACTION_SCROLL -> {
            }

            MotionEvent.ACTION_MOVE -> {
                val distanceY = y - startDragY
                val distanceX = x - startDragX

                if (abs(distanceY) > abs(distanceX)) {
                    if (distanceY < 0 && abs(distanceY) > SWIPE_THRESHOLD_VELOCITY_Y) {
                        Timber.e("onInterceptTouchEvent : ACTION_MOVE = onSwipeUp")

                        listener.onSwipeUp(x, y)

                    } else if (abs(distanceY) > SWIPE_THRESHOLD_VELOCITY_Y) {
                        Timber.e("onInterceptTouchEvent : ACTION_MOVE = onSwipeDown")

                        listener.onSwipeDown(x, y)
                    }
                } else {
                    if (distanceX > 0 && abs(distanceX) > SWIPE_THRESHOLD_VELOCITY_X) {
                        Timber.e("onInterceptTouchEvent : ACTION_MOVE = onSwipeRight")

                        listener.onSwipeRight(x, y)
                    } else if (abs(distanceX) > SWIPE_THRESHOLD_VELOCITY_X) {
                        Timber.e("onInterceptTouchEvent : ACTION_MOVE = onSwipeLeft")

                        listener.onSwipeLeft(x, y)
                    }
                }
            }
        }

        return super.onTouchEvent(ev)
    }
}
