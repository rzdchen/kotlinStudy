package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_button_select.*

class ButtonSelectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_select)
        initCheckListener()
    }

    private fun initCheckListener() {
        cb_1.setOnCheckedChangeListener { buttonView, isCheck ->
            tv_desc.text = "您${if (isCheck) "勾选" else "取消勾选"}了复选框"
        }
        rg_single_select.setOnCheckedChangeListener { group, checkId ->
            tv_desc.text = when (checkId) {
                R.id.rb_1 -> rb_1.text
                R.id.rb_2 -> rb_2.text
                R.id.rb_3 -> rb_3.text
                R.id.rb_4 -> rb_4.text
                else -> ""
            }
        }
    }
}