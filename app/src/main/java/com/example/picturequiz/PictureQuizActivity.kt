package com.example.picturequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class PictureQuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer(){
        val answer = etAnswer.text.toString()

        if (answer == getString(R.string.giraffe))
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()

    }
}
