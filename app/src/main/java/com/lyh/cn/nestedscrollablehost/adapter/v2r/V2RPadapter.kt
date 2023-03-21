package com.lyh.cn.nestedscrollablehost.adapter.v2r

import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.lyh.cn.nestedscrollablehost.R
import com.lyh.cn.nestedscrollablehost.StaticData
import com.lyh.cn.nestedscrollablehost.adapter.Itemadapter

class V2RPadapter (list:MutableList<String>):
    BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_v2r,list){
    override fun convert(holder: BaseViewHolder, item: String) {
        val no: TextView = holder.getView(R.id.no)
        no.text = "${holder.layoutPosition+1},水平滑动嵌套"
        val recy: RecyclerView = holder.getView(R.id.recy);
        recy.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recy.adapter = Itemadapter(StaticData.listB.toMutableList())
    }
}