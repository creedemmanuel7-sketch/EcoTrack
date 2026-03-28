package com.wamm.ecotrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcoTrackTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Scaffold { padding ->
        Text(
            text = stringResource(id = R.string.welcome_message),
            modifier = Modifier.padding(padding),
            style = MaterialTheme.typography.headlineMedium
        )
    }
}

@Composable
fun EcoTrackTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(), // Simplification for setup
        content = content
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EcoTrackTheme {
        Greeting()
    }
}
