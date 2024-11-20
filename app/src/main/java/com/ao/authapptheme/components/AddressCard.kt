package com.ao.authapptheme.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ao.authapptheme.R

@Composable
fun AddresCard(
    onDetail: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(16.dp),
        backgroundColor = Color.White,
        elevation = 8.dp,
        content = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Absolute.Left
                ) {
                    Image(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(0)),
                        painter = painterResource(R.drawable.java),
                        contentDescription = null
                    )

                    Spacer(modifier = Modifier.weight(16f))
                    // is text for our theme
                    Text(
                        text = "Java lenguage",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.weight(16f))
                    // is a button, if you click it will go to anouther place to our programming
                    Button(
                        onClick = onDetail,
                        Modifier
                            .padding(8.dp)
                            .clip(RoundedCornerShape(20)),
                        enabled = true,
                        border = BorderStroke(1.dp, Color.Black),

                        ) {
                        Text("ler")
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AddressCardPreview() {
    Surface(

    ) {
        AddresCard {  }
    }
}
