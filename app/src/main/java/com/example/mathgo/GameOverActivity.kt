package com.example.mathgo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_over.*
import kotlinx.android.synthetic.main.activity_win.*
import kotlinx.android.synthetic.main.activity_win.janabas
import kotlinx.android.synthetic.main.activity_win.shigiw

class GameOverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)

        var rigthAnswerCount=intent.getIntExtra(GameActivity.RIGHT_ANSWERS_COUNT,0)
        tvScore.text="$rigthAnswerCount/${GameActivity.LEVEL_COUNT}"
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
