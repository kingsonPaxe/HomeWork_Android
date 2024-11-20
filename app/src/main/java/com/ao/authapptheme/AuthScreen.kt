package com.ao.authapptheme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthScreen(onEnterClick: (User) -> Unit) {
    Column (
        modifier = Modifier
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(40))
                ,
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null
        )
        // Spacer to give space beetwen
        Spacer(modifier = Modifier.height(60.dp))
        var username by remember {
            mutableStateOf("")
        }
        var password by remember {
            mutableStateOf("")
        }
        TextField(value = username,
            onValueChange = { newValue ->
                username = newValue
            },
            Modifier
                .padding(8.dp)
                ,
            label = {
                Text("Usuário")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "representa um usúario"
                )
            },
        )
        TextField(
            value = password,
            onValueChange = { newValue ->
                password = newValue
            }, Modifier
                .padding(8.dp)
                ,
            label = {
                Text("Senha")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "representação da senha do usuário"
                )
            },
            visualTransformation = PasswordVisualTransformation()
        )
        Button(
            onClick = {
                onEnterClick(
                    User(
                        username,
                        password
                    )
                )
            },
            Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(20)),
        ) {
            Text(text = "Login")
        }
    }
}

@Composable
@Preview
fun AuthScreenPreview() {
    Surface(
        modifier = Modifier.fillMaxSize()
            .padding(8.dp),
        color = MaterialTheme.colorScheme.background
    ) {
        AuthScreen(onEnterClick = {})
    }
}
