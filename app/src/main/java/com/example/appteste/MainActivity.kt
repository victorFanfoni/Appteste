package com.example.appteste

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextPassword = findViewById<EditText>(R.id.editTextTextPassword)
        var buttonEnviar = findViewById<Button>(R.id.buttonEnviar)

        buttonEnviar.setOnClickListener {
            if (editTextPassword.text.toString() == "123456") {
                Toast.makeText(this, "Acesso permitido", Toast.LENGTH_SHORT).show()
                Log.d("MainActivity", "Acesso permitido")
            } else {
                Toast.makeText(this, "Acesso negado", Toast.LENGTH_SHORT).show()
                Log.d("MainActivity", "Password incorreto")
            }
        }
    }
}
