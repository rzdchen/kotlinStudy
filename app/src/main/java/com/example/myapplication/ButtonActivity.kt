package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener {

    //3.接口实现方式
    override fun onClick(v: View) {
        if (v.id == R.id.btn_click_interface) {

        }
    }

    override fun onLongClick(v: View): Boolean {
        if (v.id == R.id.btn_click_interface) {
            Toast.makeText(this, "长按事件", Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        initButtonClickListener()
    }

    private fun initButtonClickListener() {
        //简化最彻底的表达形式
        btn_click.setOnClickListener {
            btn_click.text = "您点了一下"
        }
        btn_click_long.setOnLongClickListener {
            btn_click_long.text = "您长按了一小会"
            true
        }
        //1.匿名函数方式
        btn_click_anonymos.setOnClickListener { v ->
            var str = (v as Button).text
        }
        btn_click_anonymos.setOnLongClickListener { v ->
            var str = (v as Button).text
            true
        }
        //2.内部类方式
        btn_click_inner.setOnClickListener(MyClickListener())
        btn_click_inner.setOnLongClickListener(MyLongClickListener())
    }

    private inner class MyClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            var str = (v as Button).text
        }
    }

    private inner class MyLongClickListener : View.OnLongClickListener {
        override fun onLongClick(v: View?): Boolean {
            toastShort("长按${(v as Button).text}")
            return true
        }
    }
    fun toastShort(str:String?){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }
}
