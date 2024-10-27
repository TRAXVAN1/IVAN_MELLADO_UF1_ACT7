package com.example.ivan_mellado_hernandez_uf1_act7

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

        // Referencias a los EditText y Button
        val editTextUser: EditText = findViewById(R.id.editTextUser)
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)
        val buttonConfirm: Button = findViewById(R.id.buttonConfirm)

        // Acción del botón de confirmación
        buttonConfirm.setOnClickListener {
            val user = editTextUser.text.toString()
            val password = editTextPassword.text.toString()

            // Mostrar Toast
            Toast.makeText(this, "Usuario: $user\nContraseña: $password", Toast.LENGTH_SHORT).show()

            // Logcat
            Log.d("LoginInfo", "Usuario: $user, Contraseña: $password")
        }
    }
}
