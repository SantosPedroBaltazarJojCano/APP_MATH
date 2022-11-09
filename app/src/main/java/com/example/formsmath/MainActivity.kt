package com.example.formsmath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //botones
        //1
        val btn1: Button = findViewById(R.id.boton1)
            btn1.setOnClickListener{
                val intent = Intent(this,matbasic::class.java)
                startActivity(intent)
            }
    }
}