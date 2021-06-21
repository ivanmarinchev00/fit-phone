package com.example.fitphone

import android.content.ContentValues.TAG
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_chronicle.*

class ChronicleActivity : AppCompatActivity() {
    lateinit var id: String
    var mood: String = ""
    var description: String = ""
    lateinit var db: FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chronicle)

        id= Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
        db = FirebaseFirestore.getInstance()

//        var currentCollection = db.collection("chronicles").document(id)

        var sadFace = findViewById(R.id.sad_emoji_btn) as ImageView
        sadFace.setOnClickListener {
            mood = "sad"
        }

        var mehFace = findViewById<ImageView>(R.id.meh_emoji_btn)
        mehFace.setOnClickListener {
            mood = "meh"
        }

        var happyFace = findViewById<ImageView>(R.id.happy_emoji_btn)
        happyFace.setOnClickListener {
            mood = "happy"
        }





        chronicles_complete_btn.setOnClickListener {
            if(mood.length > 1 || description.length > 1){
//                if(currentCollection != null){
                    db.collection("chronicles").add(id)
                            .addOnSuccessListener {
                                Toast.makeText(this@ChronicleActivity, "record added successfully ", Toast.LENGTH_SHORT ).show()
                            }
                            .addOnFailureListener {
                                Toast.makeText(this@ChronicleActivity, "record not added ", Toast.LENGTH_SHORT ).show()
                            }
                    val intent = Intent(this, ChronicleScripturesActivity::class.java)
                    startActivity(intent)
//                }
            }
            else{
                Log.d("TEG", mood.length.toString())
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Select an emoji for your mood and write a description")
                builder.setMessage("It is for your own reflection")

                builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    Toast.makeText(applicationContext,
                            android.R.string.yes, Toast.LENGTH_SHORT).show()
                }

                builder.setNegativeButton(android.R.string.no) { dialog, which ->
                    Toast.makeText(applicationContext,
                            android.R.string.no, Toast.LENGTH_SHORT).show()
                }

                builder.show()
            }
            }


        home_chronicle_btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) }

        challenges_chronicle_btn.setOnClickListener {
            val intent = Intent(this, ChallengeListActivity::class.java)
            startActivity(intent) }

        wisdom_chronicle_btn.setOnClickListener {
            val intent = Intent(this, WisdomActivity::class.java)
            startActivity(intent) }

        profile_chronicle_btn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent) }
    }

    fun showSimpleDialog(){
        val builder:AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Select a mood")
        builder.setMessage("This helps you reflect better in the future")
        builder.setIcon(R.drawable.ic_launcher_background)

        builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
            dialog.dismiss()
        } );

        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()
    }

}