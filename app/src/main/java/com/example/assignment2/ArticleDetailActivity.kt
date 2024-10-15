package com.example.assignment2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class ArticleDetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_article_detail)
      val title = intent.getStringExtra("title")
        val heading = intent.getStringExtra("heading")
        val image = intent.getIntExtra("image", 0)
        val desc = intent.getStringExtra("desc")
        val detail=intent.getStringExtra("detail")


        findViewById<TextView>(R.id.title1).text = title
        findViewById<TextView>(R.id.heading1).text = heading
        findViewById<ImageView>(R.id.img1).setImageResource(image)
     findViewById<TextView>(R.id.desc1).text=detail

    }
}