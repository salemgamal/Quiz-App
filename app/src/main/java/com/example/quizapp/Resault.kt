package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resault.*

class Resault : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resault)
        val tvName = winnerName
        val tvResult = result
        val btn = finish

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val totalQues = intent.getIntExtra(Constants.TOTAL_QUESTIONS , 0)
        val correctAns = intent.getIntExtra(Constants.CORRECT_ANSWERS , 0)

        tvResult.text = "Your Score is ${correctAns} out of ${totalQues}"

        btn.setOnClickListener {
            startActivity(Intent(this , MainActivity::class.java))
        }
    }
}