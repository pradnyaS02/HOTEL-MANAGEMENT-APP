package com.example.swagathotel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.startapp.*


class startapps : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startapp)

        customer.setOnClickListener(){
            var intent= Intent(this,Counts::class.java)
            startActivity(intent)

        }

        menubut.setOnClickListener(){
            var intent= Intent(this,Menusad::class.java)
            startActivity(intent)

        }

    }
}