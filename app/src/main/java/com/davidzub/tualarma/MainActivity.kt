package com.davidzub.tualarma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        val createButton: Button = findViewById(R.id.buttonInit)
        createButton.setOnClickListener {
            val intent = Intent(this, Alarmas::class.java)
            startActivity(intent)
        }
    }
}