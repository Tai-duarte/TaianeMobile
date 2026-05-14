package com.example.taianemobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            MessageCard(
                msg = IMessage(
                    "ola",
                    "oi"
                )
            )
        }
    }
}

data class IMessage(val author: String, val body: String)

@Composable
fun MessageCard(msg: IMessage) {

    Row(modifier = Modifier.padding(8.dp)) {

        Image(
            painter = painterResource(R.drawable.download),
            contentDescription = "Imagem de Perfil",
            modifier = Modifier.size(45.dp)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column {

            Text(text = msg.author)

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = msg.body)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMsg() {

    Column {

        MessageCard(msg = IMessage("oi", "lari"))
        MessageCard(msg = IMessage("oi", "tai"))
        MessageCard(msg = IMessage("oi", "miriam"))
    }
}