package com.example.lotteryapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LotteryNumListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lottery_num_list)

        val pref = getSharedPreferences("nums", Context.MODE_PRIVATE)
        var lottoNums = pref.getString("lottonums", "")
        var numList = if (lottoNums == "") {
            mutableListOf<String>()
        } else {
            lottoNums!!.split(",").toMutableList()
        }

        val listView = findViewById<RecyclerView>(R.id.s_num)

        listView.layoutManager = LinearLayoutManager(this)

        listView.adapter = LotteryListAdapter(numList)

        listView.setHasFixedSize(true)

    }
}