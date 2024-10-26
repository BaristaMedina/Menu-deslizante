package com.example.menudeslizante

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CoctelesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cocteles)

        // Vinculamos el botón de "Regresar al Menú"
        val backButton = findViewById<Button>(R.id.button_back_to_menu)
        backButton.setOnClickListener {
            // Acción para regresar al MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
