package com.example.haymi

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.haymi.ui.theme.HaymiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()

            }
        }
    }

@Preview(showBackground = true)
@Composable
fun Greeting() {
   Column (
       modifier = Modifier
           .background(Color.Unspecified)
//           .fillMaxWidth()
//           .fillMaxHeight()
           .fillMaxSize() ,

//       verticalArrangement = Arrangement.Center ,
       horizontalAlignment = Alignment.CenterHorizontally


   ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
                .height(30.dp)



        ) {
            Text(text = "Chats")
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = "Calls")
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = "Status")
        }
       Spacer(modifier = Modifier.height(50.dp))


       Text(text = "first Android project", color= Color.DarkGray , fontSize = 20.sp )
       val about = LocalContext.current
      Button(onClick = {
          about.startActivity(Intent(about,AboutActivity::class.java))

      }) {
          Text(text ="About" )

      }
       Text(text="text ", fontFamily = FontFamily.Serif, modifier = Modifier.background(Color.Magenta))
       val img = LocalContext.current
       Button(onClick = {
           img.startActivity((Intent(img,ImageActivity::class.java)))
       }) {
           Text(text="img"  )

       }
       var scr = LocalContext.current
       Button(onClick = {scr.startActivity((Intent(scr,ImageActivity::class.java))) })
       {
           Text(text = "Scroll")

       }






   }

}


