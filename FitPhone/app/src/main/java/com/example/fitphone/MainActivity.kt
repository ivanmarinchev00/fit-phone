package com.example.fitphone

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.Settings
import android.telephony.TelephonyManager
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.fitphone.Model.User
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var db: FirebaseFirestore
    lateinit var id: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = FirebaseFirestore.getInstance()

        id= Settings.Secure.getString(contentResolver,Settings.Secure.ANDROID_ID)
        Log.d("uid",id)


        val login = findViewById(R.id.login) as ConstraintLayout

        //Check if the user exists and show login panel accordingly
        db.collection("users")
                .document("12312312312")
                .get()
                .addOnSuccessListener { doc->
                    if(doc.exists()) {
                        Log.d("exist", "da")
                        login.visibility = View.INVISIBLE
                    } else {
                        Log.d("exist", "ne")
                        login.visibility = View.VISIBLE
                    }
                }

        challenge_btn.setOnClickListener {
            val intent = Intent(this, ChallengeListActivity::class.java)
            startActivity(intent) }

        chronicle_btn.setOnClickListener {
            val intent = Intent(this, ChronicleActivity::class.java)
            startActivity(intent) }

        wisdom_btn.setOnClickListener {
            val intent = Intent(this, WisdomActivity::class.java)
            startActivity(intent) }

        challenge_home_btn.setOnClickListener {
            val intent = Intent(this, ChallengeListActivity::class.java)
            startActivity(intent) }

        chronicle_home_btn.setOnClickListener {
            val intent = Intent(this, ChronicleActivity::class.java)
            startActivity(intent) }

        wisdom_home_btn.setOnClickListener {
            val intent = Intent(this, WisdomActivity::class.java)
            startActivity(intent) }

        profile_home_btn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent) }
    }

    fun handleClick(view: View){

        val usernameTextInput = findViewById(R.id.textInputLayout) as TextInputLayout
        val username = usernameTextInput.editText?.text.toString();
        val articles = ArrayList<Int>();
        val progressChallenges = ArrayList<Int>();
        val completedChannelges = ArrayList<Int>();
        val user = User(username,articles,completedChannelges,progressChallenges,0)

        db.collection("users").document(id).set(user)

    }

}