package com.oceanbrasil.android_intro_julho_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val btVoltar = findViewById<Button>(R.id.btVoltar)

        btVoltar.setOnClickListener {
            finish()
        }
    }
}
