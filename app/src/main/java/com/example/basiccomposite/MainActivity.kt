package com.example.basiccomposite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiccomposite.ui.theme.BasicCompositeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicCompositeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(

                        yogi = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(yogi: Modifier = Modifier){
    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Indonesia", modifier = yogi,
            fontSize = 30.sp, color = Color.Red, fontWeight = FontWeight.Bold,
            )
        Text(text = "Versus",
            style = TextStyle(
                fontSize = 50.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Blue
            )
        )
        Image(painter = painterResource(id = R.drawable.china), contentDescription = null,
            modifier = yogi.size(width = 200.dp, height = 200.dp))
// menambahkan Colom baru
        Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Nama:")
            Text(text = "YogiDewanto", modifier = yogi,
                fontSize = 40.sp, color = Color.Black, fontWeight = FontWeight.SemiBold
                )
            Text(text = "NIM: 20220140023",
                )
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
    BasicCompositeTheme {
        Greeting("Android")
    }
}