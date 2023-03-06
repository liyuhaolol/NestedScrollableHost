package com.lyh.cn.nestedscrollablehost.adapter.r2r

import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.lyh.cn.nestedscrollablehost.R

class R2RSadapter(list:MutableList<String>) :BaseQuickAdapter<String,BaseViewHolder>(R.layout.item_r2r,list){

    override fun convert(holder: BaseViewHolder, item: String) {
        val no:TextView = holder.getView(R.id.no)
        no.text = "${holder.layoutPosition+1},纵向滑动嵌套"
    }
}