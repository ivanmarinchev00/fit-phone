package com.example.fitphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_wisdom.*

class WisdomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisdom)

        topic_1_btn.setOnClickListener {
            val intent = Intent(this, TopicArticlesActivity::class.java)
            startActivity(intent) }

        // TODO 'UNCOMMENT TO ADD CHANGES TO INTENT'
        // topic_2_btn.setOnClickListener {
        //  val intent = Intent(this, TopicArticlesActivity::class.java)
        //  startActivity(intent) }
        //
        //   topic_3_btn.setOnClickListener {
        //      val intent = Intent(this, TopicArticlesActivity::class.java)
        //      startActivity(intent) }

        home_wisdom_btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) }

        challenges_wisdom_btn.setOnClickListener {
            val intent = Intent(this, ChallengeListActivity::class.java)
            startActivity(intent) }

        chronicles_wisdom_btn.setOnClickListener {
            val intent = Intent(this, ChronicleActivity::class.java)
            startActivity(intent) }

        profile_wisdom_btn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent) }
    }
}