package com.example.miprimerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.miprimerapp.botones.BotonIcono
import com.example.miprimerapp.botones.BotonNormal
import com.example.miprimerapp.botones.BotonOutline
import com.example.miprimerapp.botones.BotonSwitch
import com.example.miprimerapp.botones.BotonTexto
import com.example.miprimerapp.botones.DarkMode
import com.example.miprimerapp.botones.FloatingAction
import com.example.miprimerapp.botones.Space
import com.example.miprimerapp.ui.theme.MiPrimerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember { mutableStateOf(false) }
                MiPrimerAppTheme(darkTheme = darkMode.value) {
                Surface (
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.background
                ){
                    Content(darkMode)
                }
            }
        }
    }
}
@Composable
fun Content(darkMode : MutableState<Boolean>){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        BotonNormal()
        Space()
        BotonNormal()
        Space()
        BotonTexto()
        Space()
        BotonOutline()
        Space()
        BotonIcono()
        Space()
        BotonSwitch()
        Space()

        DarkMode(darkMode = darkMode)
        Space()
        FloatingAction()
    }
}

