package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class DynamicViewStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this)
        root.orientation = LinearLayout.VERTICAL
        root.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )



        val DPToPX = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            10f,
            resources.displayMetrics
        ).toInt()
        Log.d("my_tag",DPToPX.toString())



        val btn = Button(this)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
//        params.setMargins(DPToPX, DPToPX, DPToPX, DPToPX)
//        btn.layoutParams = params
//        params.setMargins(DPToPX, DPToPX, DPToPX, DPToPX)
//        btn.layoutParams = params
//        btn.text = "Hello"
//        btn.setTextSize(TypedValue.COMPLEX_UNIT_SP,26f)
//        btn.setTextColor(Color.RED)

        val editText = EditText(this)

        val height = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            100f,
            resources.displayMetrics
        ).toInt()
        Log.d("my_tag", height.toString())
        editText.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            height
        )

//        root.addView(btn)

        root.addView(editText)
        root.addView(btn)
        //레이아웃 리소소 id 혹은 뷰그룹 객체 전달 가능
        setContentView(root)


    }
}