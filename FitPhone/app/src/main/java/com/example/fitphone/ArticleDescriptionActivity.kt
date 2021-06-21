package com.example.fitphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_article_description.*

class ArticleDescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_description)

        articleComplete_btn.setOnClickListener {
            val intent = Intent(this, TopicArticlesActivity::class.java)
            startActivity(intent) }
    }
}