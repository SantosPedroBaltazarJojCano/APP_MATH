package com.example.formsmath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class matbasic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matbasic)
         //botones
        //geo
        val btngeo: Button = findViewById(R.id.geo)
        btngeo.setOnClickListener{
            val intent = Intent(this,geo::class.java)
            startActivity(intent)
        }
        //des
        val btndes: Button = findViewById(R.id.desigual)
        btndes.setOnClickListener{
            val intent = Intent(this,desigualdades::class.java)
            startActivity(intent)
        }

    }
}