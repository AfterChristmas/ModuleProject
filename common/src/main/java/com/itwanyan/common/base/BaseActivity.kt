package com.itwanyan.common.base

import android.content.res.Configuration
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

/**
 * @Description:
 * @Date: 2019/9/5 09:01
 * @Auther: wanyan
 */
open class BaseActivity : AppCompatActivity() {
    override fun onConfigurationChanged(configuration: Configuration) {
        super.onConfigurationChanged(configuration)
        val currentNightMode = configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        when (currentNightMode) {
            Configuration.UI_MODE_NIGHT_NO -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                Log.e("darkMode","NO")
            } // Night mode is not active, we're using the light theme
            Configuration.UI_MODE_NIGHT_YES -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                Log.e("darkMode","NO")
            } // Night mode is active, we're using dark theme

        }
    }
}