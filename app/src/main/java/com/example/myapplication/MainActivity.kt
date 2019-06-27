package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //3.接口实现方式
    override fun onClick(v: View) {
        if (v.id == R.id.btn_button) {
            startActivity(Intent(this, ButtonActivity::class.java))
        } else if (v.id == R.id.btn_radio_button) {
            startActivity(Intent(this, ButtonSelectActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initClickListener()
    }

    private fun initClickListener() {
        btn_button.setOnClickListener(this)
        btn_radio_button.setOnClickListener(this)
    }


}
