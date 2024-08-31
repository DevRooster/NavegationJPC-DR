package com.example.navegationjpc_dr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navegationjpc_dr.ui.presentation.component.MyAppDrawer
import com.example.navegationjpc_dr.ui.theme.NavegationJPCDRTheme
import com.example.navegationjpc_dr.ui.theme.ThemeType
import com.example.navegationjpc_dr.utils.isNight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavegationJPCDRTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    val themeType= remember{ mutableSetOf(ThemeType.RED) }
                    val darkThemex= isNight()
                    val darkTheme= remember { mutableStateOf(darkThemex) }
                    MyAppDrawer(darkMode = darkTheme  , themeType = themeType)
                }
            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavegationJPCDRTheme {
        Greeting("Android")
    }
}