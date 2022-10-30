package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et_name : EditText = name
        start.setOnClickListener {
            if(et_name.text.isNotEmpty()){
                val intent = Intent(this , QuizQuesActivity::class.java)
                intent.putExtra(Constants.USER_NAME , name.text.toString())
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this , "Please enter your name!" , Toast.LENGTH_LONG).show()
            }

        }
    }
}