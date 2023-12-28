package com.uasmobcom.noteprohalal

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.*
import com.uasmobcom.noteprohalal.ui.theme.IntentHomeworkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentHomeworkTheme {
                // A surface container using the 'background' color from the theme
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {
    val context = LocalContext.current
    val intent = Intent(context, SecondActivity::class.java)
    val intent2 = Intent(context, SecondActivity2::class.java)


    Column {
        TopAppBar(
            title = { Text(text = "Note Pro HALAL")},
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.banner_1),
                contentDescription = "Thumbnail",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = "Link",
                modifier = Modifier.padding(16.dp),
                style = TextStyle(fontSize = 18.sp)
            )
            Row {
                Button(
                    onClick = {
                        startActivity(context, intent, null)
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Youtube Tutorial")
                }
                Button(
                    onClick = {
                        startActivity(context, intent2, null)
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Apps Note Pro")
                }
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntentHomeworkTheme {
        Greeting()
    }
}