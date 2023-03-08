package com.lyh.cn.nestedscrollablehost.adapter.r2v

import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.lyh.cn.nestedscrollablehost.R
import com.lyh.cn.nestedscrollablehost.StaticData
import com.lyh.cn.nestedscrollablehost.adapter.Itemadapter

class R2VSadapter(list:MutableList<String>) :
    BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_r2v,list){

    override fun convert(holder: BaseViewHolder, item: String) {
        val no: TextView = holder.getView(R.id.no)
        no.text = "${holder.layoutPosition+1},纵向滑动嵌套"
        val vp:ViewPager2 = holder.getView(R.id.vp)
        vp.orientation = ViewPager2.ORIENTATION_VERTICAL
        vp.adapter = Itemadapter(StaticData.listB.toMutableList())
    }
}