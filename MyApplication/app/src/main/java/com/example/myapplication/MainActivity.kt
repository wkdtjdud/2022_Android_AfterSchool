package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.relative_study1)
      //  setContentView(R.layout.nested_viewgroup)
        setContentView(R.layout.view_study2)

        // 체크박스 뷰 가져오기
        val checkBox = findViewById<CheckBox>(R.id.checkbox1)
        checkBox.setOnCheckedChangeListener {
                compoundButton, b ->
            if (b){
                //체크박스가 체크되었을 때 로직
                Log.d("my_tag","checked")
            }
            else {
                //아닌 경우 로직
                Log.d("my tag", "unchecked")
            }

        }

        val group = findViewById<RadioGroup>(R.id.radio_group)
        group.setOnCheckedChangeListener { radioGroup, id ->
            //when = case
            when (id) {
                R.id.radio_button1 -> {
                    Log.d("my_tag", "버튼 1 선택")
                }
                R.id.radio_button2 -> {
                    Log.d("my_tag", "버튼 2 선택")
                }
            }
        }
        val spinner = findViewById<Spinner>(R.id.my_spinner)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.my_str_array,
            android.R.layout.simple_spinner_dropdown_item
        )
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
               val selected =
                p0?.getItemAtPosition(p2).toString()


                Log.d("my_tag", selected)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
//       var button = findViewById<Button>(R.id.button2)
//        button.setOnClickListener{
//            Log.d("my_tag","OnClick")
//        }
//        button.setOnLongClickListener {
//            Log.d("my_tag", "OnLongClick")
//            true
//
//        }
//
//
//        var toggle = findViewById<ToggleButton>(R.id.my_toggle_button)
//        toggle.setOnCheckedChangeListener{
//            compoundButton, isChecked ->
//            Log.d("my_tag", "checked : ${isChecked}")
//        }
//        val editText = findViewById<EditText>(R.id.edittext2)
//        editText.addTextChangedListener {
//            Log.d("my_tag",it.toString())
//        }
//        editText.setOnFocusChangeListener{ view, b->
//            Log.d("my_tag", "focused : ${b}")
//            if(b) view.setBackgroundColor(Color.YELLOW)
//            else view.setBackgroundColor(Color.WHITE)
//        }

        }

}