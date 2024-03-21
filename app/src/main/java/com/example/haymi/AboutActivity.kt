package com.example.haymi

import android.content.Intent
import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.haymi.ui.theme.HaymiTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun About() {
    Column (
        modifier= Modifier
            .background(Color.DarkGray)
            .fillMaxSize()
            .padding(10.dp)
    ){
        Text(text = " About")
        Text(text = " project")
        val home = LocalContext.current
        Button(onClick = {
            home.startActivity(Intent(home, MainActivity::class.java))
        } ,
//            colors =ButtonDefaults.buttonColors(Color.Cyan),
//            shape= CircleShape
//            shape= RoundedCornerShape(10.dp)
            shape= CutCornerShape(10),
            colors = ButtonDefaults.outlinedButtonColors(Color.White),
            border= BorderStroke(5.dp,Color.Black)
        ) {
            Text(text = "home", color=Color.Black)


        }
        val text = AnnotatedString("Home")
        val h = LocalContext.current
     ClickableText(text = text , onClick = {

     h.startActivity((Intent(h,MainActivity::class.java)))
     })


}

        }








