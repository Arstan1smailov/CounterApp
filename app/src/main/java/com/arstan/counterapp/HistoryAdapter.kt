package com.arstan.counterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class HistoryAdapter(var list: ArrayList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       return HistoryViewHolder(
           LayoutInflater.from(parent.context)
               .inflate(R.layout.item_history, parent,false)
       )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is HistoryViewHolder ->{
                holder.bind(list, position)
            }
        }
    }

    override fun getItemCount() = list.size

    class HistoryViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val result: TextView = itemView.findViewById(R.id.result)
        fun bind(list: ArrayList<String>, position: Int){
            result.text = list[position]
        }
    }
}