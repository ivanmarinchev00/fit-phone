package com.example.fitphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_challenge_list.*

class ChallengeListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge_list)

        challenge_1_btn.setOnClickListener {
            val intent = Intent(this, ChallengeActivity::class.java)
            startActivity(intent) }

        // TODO 'UNCOMMENT TO ADD CHANGES TO INTENT'
//        challenge_2_btn.setOnClickListener {
//            val intent = Intent(this, ChallengeActivity::class.java)
//            startActivity(intent) }
//
//        challenge_3_btn.setOnClickListener {
//            val intent = Intent(this, ChallengeActivity::class.java)
//            startActivity(intent) }

        // TODO 'ADD AN ADDNEWCHALLENGE METHOD FOR NEW CHALLENGE'

        home_challenges_btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) }

        chronicles_challenges_btn.setOnClickListener {
            val intent = Intent(this, ChronicleActivity::class.java)
            startActivity(intent) }

        wisdom_challenges_btn.setOnClickListener {
            val intent = Intent(this, ChallengeListActivity::class.java)
            startActivity(intent) }

        profile_challenges_btn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent) }
    }
}