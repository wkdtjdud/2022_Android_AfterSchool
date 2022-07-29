package com.example.todayquote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random
import java.util.*

class LottoMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lotto_main)

        val rnds = (0..10).random()



        fun main() {
            val myRandomValues = List(5) { Random.nextInt(0, 30) }

            // Prints a new sequence every time
            println(myRandomValues)

        }

    }
}