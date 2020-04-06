package com.example.mathgo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_win.*

class GameOverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)

        janabas.setOnClickListener{
            val xat = Intent (this, MainActivity::class.java)
            startActivity(xat)
            finish()
        }

        shigiw.setOnClickListener{
            finish()
        }

    }
}
