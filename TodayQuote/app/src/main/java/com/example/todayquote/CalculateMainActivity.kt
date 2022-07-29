package com.example.todayquote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class CalculateMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_main)
        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val operator = findViewById<EditText>(R.id.operator)
        val calcBtn = findViewById<Button>(R.id.calc_btn)

        calcBtn.setOnClickListener{
            Log.d("mytag", num1.text.toString())
            Log.d("mytag", num2.text.toString())
            Log.d("mytag", operator.text.toString())
//            val bad = Integer.parseInt(num1.text.toString())

            val n1 : Int = num1.text.toString().toInt()
            val n2 = num2.text.toString().toInt()
//            새 액티비티(CalculateResultActivity) 만들고
//            그 과정에서 putExtra로 인센트에 n1, n2, 연산자 문자열 전달
            val intent = Intent(this, CalculateResultActivity::class.java)
            intent.putExtra("num1", n1)
            intent.putExtra("num2", n2)
            intent.putExtra("operator",operator.text.toString())
            startActivity(intent)


        }
    }
}


























