package com.example.taianemobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taianemobile.ui.theme.TaianeMobileTheme
import java.util.random.RandomGeneratorFactory.all

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        enableEdgeToEdge()
        setContent {
            Column {
                MessageCard(Message(author = "Taiane", body = "Olá!."))
                MessageCard(Message(author = "Miriam", body = "Ola!."))
                MessageCard(Message(author = "Larissa", body = "Olá!."))
            }
        }


        }
    }


data class Message(val author: String, val body: String)

@Composable
fun MessageCard(mag: Message) {
    Row {
        Image(
            painter = painterResource(R.drawable.download),
            contentDescription = "imagem do perfil",
            modifier = Modifier
                .size(45.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column {
            Text(text = mag.author)
            Text(text = mag.body)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Column {
        MessageCard(
            Message(
                author = "Taiane",
                body = "Olá!"
            )
        )
        MessageCard(
            Message(
                author = "Miriam",
                body = "Olá!"
            )
        )
        MessageCard(
            Message(
                author = "Larissa",
                body = "Olá!"
            )
        )
    }
}