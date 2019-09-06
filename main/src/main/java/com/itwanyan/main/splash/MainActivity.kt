package com.itwanyan.main.splash

import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.itwanyan.common.base.BaseActivity
import com.itwanyan.personal.R
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * @Description:
 * @Date: 2019/9/5 18:31
 * @Auther: wanyan
 */
class MainActivity :BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        tv_jump.setOnClickListener {
            // 1. 应用内简单的跳转(通过URL跳转在'进阶用法'中)
//            ARouter.getInstance().build("/test/activity").navigation()

            // 2. 跳转并携带参数
            ARouter.getInstance().build("/personal/personInfoActivity")
                .navigation()
        }
    }
}