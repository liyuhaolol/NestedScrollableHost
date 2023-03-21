package com.lyh.cn.nestedscrollablehost

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.lyh.cn.nestedscrollablehost.adapter.v2r.V2RPadapter
import com.lyh.cn.nestedscrollablehost.adapter.v2r.V2RSadapter

class V2Ractivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v)
        val vp1: ViewPager2 = findViewById(R.id.vp1)
        val adapter1 = V2RSadapter(StaticData.listA.toMutableList())
        vp1.orientation = ViewPager2.ORIENTATION_VERTICAL
        vp1.adapter = adapter1
        val vp2: ViewPager2 = findViewById(R.id.vp2)
        val adapter2 = V2RPadapter(StaticData.listA.toMutableList())
        vp2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        vp2.adapter = adapter2
    }
}