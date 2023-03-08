package com.lyh.cn.nestedscrollablehost

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() ,OnClickListener{
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener(this)
        btn2 = findViewById(R.id.btn2)
        btn2.setOnClickListener(this)
        btn3 = findViewById(R.id.btn3)
        btn3.setOnClickListener(this)
        btn4 = findViewById(R.id.btn4)
        btn4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent:Intent
        when(v?.id){
            R.id.btn1 ->{
                intent = Intent(this@MainActivity,R2Ractivity::class.java)
                startActivity(intent)
            }
            R.id.btn2 ->{
                intent = Intent(this@MainActivity,R2Vactivity::class.java)
                startActivity(intent)
            }
        }
    }
}