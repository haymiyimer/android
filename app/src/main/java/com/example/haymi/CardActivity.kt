package com.example.haymi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.haymi.ui.theme.HaymiTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Card()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Card() {
    LazyColumn(
        modifier=Modifier
            .fillMaxSize()

    )
    {
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp) ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
           androidx.compose.material3.Card(
                    elevation =CardDefaults.cardElevation(35.dp),
                    border= BorderStroke(1.dp , Color.Blue)

                )
           {

               Image(painter = painterResource(id = R.drawable.img_1), contentDescription = "")
               Text(text = "User")
           }
            }


        }
    }


}


