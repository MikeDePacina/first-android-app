package com.example.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloBtn = findViewById<Button>(R.id.helloBtn)
        helloBtn.setOnClickListener{
            Log.v("test", "Button Clicked")
            Toast.makeText(this, "Woof! woof!", Toast.LENGTH_SHORT).show()
         }
    }
}