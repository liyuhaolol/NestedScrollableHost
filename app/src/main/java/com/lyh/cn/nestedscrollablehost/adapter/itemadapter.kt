package com.lyh.cn.nestedscrollablehost.adapter

import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.lyh.cn.nestedscrollablehost.R

class itemadapter (list:MutableList<String>) :
    BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_r2r_r,list){

    override fun convert(holder: BaseViewHolder, item: String) {
        val no: TextView = holder.getView(R.id.num)
        no.text = "${holder.layoutPosition+1}"
    }
}