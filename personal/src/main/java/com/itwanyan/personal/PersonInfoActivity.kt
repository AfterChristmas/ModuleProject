package com.itwanyan.personal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = "/personal/personInfoActivity")
class PersonInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person_info)
    }
}
