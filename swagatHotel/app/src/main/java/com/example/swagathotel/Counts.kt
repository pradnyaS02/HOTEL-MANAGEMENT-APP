

package com.example.swagathotel

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.count.*

class Counts:AppCompatActivity(){
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.count)


        counterbut.setOnClickListener(){
            count++
            val textview1=findViewById(R.id.c) as TextView
            textview1.text="$count"

            Log.i("MainActivity","Button was clicked")

        }
    }
}