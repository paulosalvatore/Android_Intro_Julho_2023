package com.oceanbrasil.android_intro_julho_2023

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

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
        val etNome = findViewById<EditText>(R.id.etNome)

        // Com o botão encontrado, vamos declarar o listener
        btEnviar.setOnClickListener {
            // O código dentro das chaves será executado ao clicar no botão

            // Caso o etNome esteja em branco
            // isEmpty = Checa apenas length (quantidade de caracteres)
            // isBlank = Além do length, checa se os caracteres são espaços em branco
            if (etNome.text.isBlank()) {
                etNome.error = "Digite um nome válido!"
            } else {
                // Atualizamos o texto do TextView de ID tvResultado
                tvResultado.text = etNome.text
            }
        }

        // Comportamento do botão de abrir nova tela

        // Buscamos o botão na tela
        val btAbrirNovaTela = findViewById<Button>(R.id.btAbrirNovaTela)

        // Adicionamos um Listener
        btAbrirNovaTela.setOnClickListener {
            // Criamos a Intent de sair da tela atual (this) para a nova tela (ResultadoActivity::class.java)
            val novaTelaIntent = Intent(this, ResultadoActivity::class.java)

            // Iniciamos a nova Activity
            startActivity(novaTelaIntent)
        }
    }
}
