package com.example.assignment2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
   val textViewTitle: TextView = itemView.findViewById(R.id.title1)
    val imageView: ImageView = itemView.findViewById(R.id.img1)
    val textViewHeading: TextView = itemView.findViewById(R.id.heading1)
    val textViewDesc: TextView = itemView.findViewById(R.id.desc1)
//val textViewDetail: TextView = itemView.findViewById(R.id.detail1)
   
}