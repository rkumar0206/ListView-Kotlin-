package com.example.listviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(private var context: Context, private var list: ArrayList<Custom_list>) : BaseAdapter() {

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = list.size


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val holder: viewHolder
        var view: View?
        if (convertView == null) {

            view = LayoutInflater.from(context).inflate(R.layout.custom_listview, parent, false)
            holder = viewHolder
            holder.textName=view.findViewById(R.id.custom_list_textView)
            holder.imageName=view.findViewById(R.id.custom_list_imageview)
            view.tag = holder


        }else{
            view=convertView
            holder= view.tag as viewHolder
        }

        val currentItem=getItem(position) as Custom_list
        holder.textName.text= currentItem.text
        holder.imageName.setImageResource(currentItem.image)

        return view as View

    }


    object viewHolder {
        lateinit var textName: TextView
        lateinit var imageName: ImageView
    }
}