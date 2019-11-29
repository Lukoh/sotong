package com.megazone.megatong.presentation.common

import android.content.Context

object SharedPreference {
    fun saveSharePreferenceItemPosition(context: Context, itemPosition: Int) {
        val editor = context.getSharedPreferences("pref_item", Context.MODE_PRIVATE).edit()

        editor.putInt("item_position", itemPosition)
        editor.apply()
    }

    fun saveSharePreferenceTabPosition(context: Context, tabPosition: Int) {
        val editor = context.getSharedPreferences("pref_tab", Context.MODE_PRIVATE).edit()

        editor.putInt("tab_position", tabPosition)
        editor.apply()
    }

    fun saveSharePreferenceSocialLogin(context: Context, snsName: String) {
        val editor = context.getSharedPreferences("pref_login", Context.MODE_PRIVATE).edit()

        editor.putString("pref_login", snsName)
        editor.apply()
    }

    fun getSharedPreferenceItemPosition(context: Context): Int {
        val pref = context.getSharedPreferences("pref_item", Context.MODE_PRIVATE)

        return pref.getInt("item_position", 0)
    }

    fun getSharedPreferenceTabPosition(context: Context): Int {
        val pref = context.getSharedPreferences("pref_tab", Context.MODE_PRIVATE)

        return pref.getInt("tab_position", 0)
    }

    fun getSharedPreferenceSocialLogin(context: Context): String {
        val pref = context.getSharedPreferences("pref_login", Context.MODE_PRIVATE)

        return pref.getString("pref_login", "").toString()
    }
}