package com.lyh.cn.nestedscrollablehost.adapter

import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.lyh.cn.nestedscrollablehost.R

class Itemadapter (list:MutableList<String>) :
    BaseQuickAdapter<String, BaseViewHolder>(R.layout.item,list){

    override fun convert(holder: BaseViewHolder, item: String) {
        val no: TextView = holder.getView(R.id.num)
        no.text = "${holder.layoutPosition+1}"
    }
}