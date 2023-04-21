package com.example.clima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnChetumal = findViewById<Button>(R.id.btn_chetumal)
        val btnCancun = findViewById<Button>(R.id.btn_cancun)

        btnChetumal.setOnClickListener() { onChetumal() }
        btnCancun.setOnClickListener() { onCancun() }

    }

    private fun onChetumal() {
        val intent = Intent(this, InformationActivity::class.java)
        intent.putExtra("lugar", "Chetumal")
        startActivity(intent)
    }

    private fun onCancun() {
        val intent = Intent(this, InformationActivity::class.java)
        intent.putExtra("lugar", "Cancún")
        startActivity(intent)
    }
}