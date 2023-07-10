package com.oceanbrasil.android_intro_julho_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // findViewById -> Busca um elemento de layout pelo ID
        // <> -> Informamos o tipo do elemento (TextView, EditText, Button etc)
        // () -> Informamos o ID do elemento, através de R.id.idElemento (Ex: R.id.btEnviar)
        // Classe R -> possui referências a elementos do Android e é gerada automaticamente
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        // Com o botão encontrado, vamos declarar o listener
        btEnviar.setOnClickListener {
            // O código dentro das chaves será executado ao clicar no botão

            tvResultado.text = "Samsung Ocean!"
        }
    }
}
