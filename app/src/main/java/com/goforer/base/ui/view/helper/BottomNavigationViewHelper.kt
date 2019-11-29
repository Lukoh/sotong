package com.goforer.base.ui.view.helper

import android.annotation.SuppressLint
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.goforer.sotong.R
import timber.log.Timber

object BottomNavigationViewHelper {
    internal fun setupView(view: BottomNavigationView) {
        removeShiftMode(view)
        centerMenuIcon(view)
    }
    @SuppressLint("RestrictedApi")
    private fun removeShiftMode(view: BottomNavigationView) {
        val menuView = view.getChildAt(0) as BottomNavigationMenuView

        try {
            val shiftingMode = menuView.javaClass.getDeclaredField("mShiftingMode")

            shiftingMode.isAccessible = true
            shiftingMode.setBoolean(menuView, false)
            shiftingMode.isAccessible = false
            for (i in 0 until menuView.childCount) {
                val item = menuView.getChildAt(i) as BottomNavigationItemView

                item.setShifting(false)
                item.setChecked(item.itemData.isChecked)
            }
        } catch (t: NoSuchFieldException) {
            Timber.e("Unable to get shift mode field")
        } catch (e: IllegalAccessException) {
            Timber.e("Unable to change value of shift mode")
        }
    }
    @SuppressLint("RestrictedApi")
    private fun centerMenuIcon(view: BottomNavigationView) {
        val menuView = view.getChildAt(0) as BottomNavigationMenuView

        try {
            for (i in 0 until menuView.childCount) {
                val menuItemView = menuView.getChildAt(i) as BottomNavigationItemView
                val smallText = menuItemView.findViewById(R.id.smallLabel) as AppCompatTextView
                val icon = menuItemView.findViewById<View>(R.id.icon) as AppCompatImageView
                val params = icon.layoutParams

                smallText.visibility = View.INVISIBLE
                (params as FrameLayout.LayoutParams).gravity = Gravity.CENTER
                menuItemView.setShifting(true)
            }
        } catch (e: NoSuchFieldException) {
            Timber.e("Unable to get shift mode field")
        } catch (e: IllegalAccessException) {
            Timber.e("Unable to change value of shift mode")
        }
    }
}