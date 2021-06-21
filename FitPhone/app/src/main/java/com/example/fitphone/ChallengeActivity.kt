package com.example.fitphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_challenge.*

class ChallengeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge)

        challenge_done_btn.setOnClickListener {
            val intent = Intent(this, ChallengeListActivity::class.java)
            startActivity(intent) }

        // TODO 'ADD REFRESH METHOD FOR NEW CHALLENGE'

    }
}