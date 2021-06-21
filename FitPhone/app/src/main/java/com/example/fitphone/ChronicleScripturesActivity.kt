package com.example.fitphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chronicle_scriptures.*

class ChronicleScripturesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chronicle_scriptures)

        scripture_1_btn.setOnClickListener {
            val intent = Intent(this, ScriptureActivity::class.java)
            startActivity(intent) }

        home_scriptures_btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) }

        wisdom_scriptures_btn.setOnClickListener {
            val intent = Intent(this, WisdomActivity::class.java)
            startActivity(intent) }

        profile_scriptures_btn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent) }
    }
}