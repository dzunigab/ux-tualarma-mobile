package com.davidzub.tualarma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Alarmas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarmas)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }
}