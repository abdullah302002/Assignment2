package com.example.assignment2

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter(val articles:List<Article>): RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {


        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articles.get(position)
        holder.textViewTitle.text = article.title
        holder.imageView.setImageResource(article.imageId)
        holder.textViewHeading.text = article.heading
       holder.textViewDesc.text = article.shortDesc

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ArticleDetailActivity::class.java)

            intent.putExtra("title", article.title)
            intent.putExtra("image", article.imageId)
            intent.putExtra("heading", article.heading)
            intent.putExtra("detail", article.details)
            intent.putExtra("desc", article.shortDesc)
            holder.itemView.context.startActivity(intent)
        }
    }
}

