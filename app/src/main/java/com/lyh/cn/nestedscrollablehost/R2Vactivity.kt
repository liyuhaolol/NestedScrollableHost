package com.lyh.cn.nestedscrollablehost

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lyh.cn.nestedscrollablehost.adapter.r2v.R2VPadapter
import com.lyh.cn.nestedscrollablehost.adapter.r2v.R2VSadapter

class R2Vactivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r)
        val recy1: RecyclerView = findViewById(R.id.recy1)
        val adapter1 = R2VSadapter(StaticData.listA.toMutableList())
        recy1.layoutManager = LinearLayoutManager(this)
        recy1.adapter = adapter1
        val recy2: RecyclerView = findViewById(R.id.recy2)
        val adapter2 = R2VPadapter(StaticData.listA.toMutableList())
        recy2.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
        recy2.adapter = adapter2
    }
}