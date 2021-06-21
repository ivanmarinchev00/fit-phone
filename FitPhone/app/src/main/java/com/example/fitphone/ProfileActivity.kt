package com.example.fitphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        home_profile_btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) }

        challenge_profile_btn.setOnClickListener {
            val intent = Intent(this, ChallengeListActivity::class.java)
            startActivity(intent) }

        chronicle_profile_btn.setOnClickListener {
            val intent = Intent(this, ChronicleActivity::class.java)
            startActivity(intent) }

        wisdom_profile_btn.setOnClickListener {
            val intent = Intent(this, WisdomActivity::class.java)
            startActivity(intent) }
    }
}