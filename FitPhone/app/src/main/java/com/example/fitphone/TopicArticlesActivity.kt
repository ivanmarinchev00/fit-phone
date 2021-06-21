package com.example.fitphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_topic_articles.*

class TopicArticlesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic_articles)

        article_1_btn.setOnClickListener {
            val intent = Intent(this, ArticleDescriptionActivity::class.java)
            startActivity(intent) }

        // TODO 'UNCOMMENT TO ADD CHANGES TO INTENT'
//        article_2_btn.setOnClickListener {
//            val intent = Intent(this, ArticleDescriptionActivity::class.java)
//            startActivity(intent) }
//
//        article_3_btn.setOnClickListener {
//            val intent = Intent(this, ArticleDescriptionActivity::class.java)
//            startActivity(intent) }

        home_article_category_btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) }

        challenge_article_category_btn.setOnClickListener {
            val intent = Intent(this, ChallengeListActivity::class.java)
            startActivity(intent) }

        chronicle_article_category_btn.setOnClickListener {
            val intent = Intent(this, ChronicleActivity::class.java)
            startActivity(intent) }

        wisdom_article_category_btn.setOnClickListener {
            val intent = Intent(this, WisdomActivity::class.java)
            startActivity(intent) }

        profile_article_category_btn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent) }
    }
}