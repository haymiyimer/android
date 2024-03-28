package com.example.haymi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.haymi.ui.theme.HaymiTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Input()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input () {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding(10.dp) ,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
      var name by remember { mutableStateOf(TextFieldValue(""))}
      TextField(value = name,
          onValueChange = { name= it } ,
           leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "")},
          label = { Text(text = "Enter name "  )}  ,
          textStyle = TextStyle(Color.Red)      ,
          colors = TextFieldDefaults.outlinedTextFieldColors(
              focusedBorderColor = Color.Blue ,
              unfocusedBorderColor = Color.Cyan ,
              focusedLabelColor = Color.Magenta ,
              unfocusedLabelColor =Color.Blue ,
              cursorColor = Color.Blue ,
              unfocusedLeadingIconColor =Color.Blue ,
              focusedLeadingIconColor = Color.White

          )
      )
        Spacer(modifier = Modifier.height(15.dp))


        var email  by remember { mutableStateOf(TextFieldValue(""))}

        OutlinedTextField(
            value =  email ,
            onValueChange = {email =it }  ,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
            label = { Text(text = "Enter Email")})

        Spacer(modifier = Modifier.height(10.dp))

        var phone by remember { mutableStateOf(TextFieldValue(""))

        }
        OutlinedTextField(
            value =  phone ,
            onValueChange = {phone=it} ,
            label = { Text(text = "phone")} ,
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)

        )


    }

}




