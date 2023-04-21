package com.example.clima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InformationActivity : AppCompatActivity() {
    private lateinit var tvLugar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        initComponents()

        val result: String = intent.extras?.getString("lugar") ?: "";

        this.tvLugar.text = result
    }

    private fun initComponents() {
        this.tvLugar = findViewById<TextView>(R.id.tv_lugar_resultado)
    }
}