package com.example.myap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        bt_LogIn.setOnClickListener(){
findViewById<Button>(R.id.button).setOnClickListener {
    val intent = Intent(this,Login::class.java)
    intent.putExtra("WMI",ed_Id.text.toString())
}



    }
}