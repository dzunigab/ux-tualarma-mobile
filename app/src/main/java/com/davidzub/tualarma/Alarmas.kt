package com.davidzub.tualarma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Alarmas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarmas)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        val createButton: Button = findViewById(R.id.button4)
        createButton.setOnClickListener {
            val intent = Intent(this, CrearAlarma::class.java)
            startActivity(intent)
        }
        val createMButton: Button = findViewById(R.id.button5)
        createMButton.setOnClickListener {
            val intent = Intent(this, CrearMedicamento::class.java)
            startActivity(intent)
        }
    }
}