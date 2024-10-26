package com.example.menudeslizante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.menudeslizante.ui.theme.MenudeslizanteTheme

class MoctelesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MenudeslizanteTheme {
                // Aquí puedes personalizar el contenido de la pantalla de Mocteles
                MoctelesScreen()
            }
        }
    }
}

@Composable
fun MoctelesScreen() {
    Text(text = "Aquí irán los mocteles")
}

@Preview(showBackground = true)
@Composable
fun MoctelesScreenPreview() {
    MenudeslizanteTheme {
        MoctelesScreen()
    }
}
