package com.example.mathgo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_game.*
import kotlin.random.Random

class GameActivity : AppCompatActivity() {

    var ans = 0.0
    var schet = 0
    var tans: Double = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
         generateQuestion()
    }

    fun generateQuestion(){
        var a = Random.nextInt(1, 30)
        var b = Random.nextInt(1, 30)
        var c = Random.nextInt(1, 5)

        var belg = " "
        when (c.toString()) {
            "1" -> belg = "+"
            "2" -> belg = "-"
            "3" -> belg = "*"
            "4" -> belg = "/"
        }

        firstNumber.text = a.toString()
        secondNumber.text = b.toString()
        belgi.text = belg.toString()


        when (c.toString()) {
            "1" -> tans = a.toDouble() + b.toDouble()
            "2" -> tans = a.toDouble() - b.toDouble()
            "3" -> tans = a.toDouble() * b.toDouble()
            "4" -> {
                a *= b
                tans = a.toDouble() / b.toDouble()
                firstNumber.text = a.toString()
                secondNumber.text = b.toString()
            }
        }

        var ans1 = tans - Random.nextInt(41, 50)
        var ans2 = tans + Random.nextInt(2, 17)
        var ans3 = tans - Random.nextInt(18, 30)
        var ans4 = tans + Random.nextInt(31, 40)
        ans = tans

        var ranju = Random.nextInt(1, 4)
        answer1.text = ans1.toString()
        answer2.text = ans2.toString()
        answer3.text = ans3.toString()
        answer4.text = ans4.toString()

        when (ranju) {
            1 -> {
                answer1.text = ans.toString()
            }
            2 -> {
                answer2.text = ans.toString()
            }
            3 -> {
                answer3.text = ans.toString()
            }
            4 -> {
                answer4.text = ans.toString()
            }
        }


    }


    fun onClick (view: View) {
        val selectedAnswer = (view as Button).text.toString().toDouble()
        if (selectedAnswer == tans) {
            duris.visibility=View.VISIBLE
            schet = schet + 1
            duris.setVisibility(View.INVISIBLE)
            generateQuestion()
        } else {
            val xat = Intent(this, GameOverActivity::class.java)
            startActivity(xat)
            finish()
        }

        schet_btn.text = schet.toString()

        if (schet == 10) {
            val xat = Intent(this, WinActivity::class.java)
            startActivity(xat)
            finish()
        }
        generateQuestion()
    }

}
