package com.example.menudeslizante

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.menudeslizante.ui.theme.MenudeslizanteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MenudeslizanteTheme {
                // Estructura de la interfaz principal
                MainScreen(
                    onCoctelesClick = {
                        val intent = Intent(this, CoctelesActivity::class.java)
                        startActivity(intent)
                    },
                    onMoctelesClick = {
                        val intent = Intent(this, MoctelesActivity::class.java)
                        startActivity(intent)
                    }
                )
            }
        }
    }
}

@Composable
fun MainScreen(onCoctelesClick: () -> Unit, onMoctelesClick: () -> Unit) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Botón para Cocteles
                Button(
                    onClick = onCoctelesClick,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(text = "Cocteles")
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Botón para Mocteles
                Button(
                    onClick = onMoctelesClick,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(text = "Mocteles")
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MenudeslizanteTheme {
        MainScreen(
            onCoctelesClick = {},
            onMoctelesClick = {}
        )
    }
}
