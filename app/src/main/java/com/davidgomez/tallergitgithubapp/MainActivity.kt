package com.davidgomez.tallergitgithubapp

import android.graphics.Color.alpha
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.davidgomez.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme




@Preview(
    showSystemUi = true
)
@Composable
fun Tarjeta() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.dospuntostres),
            contentDescription = "Foto de perfil",
            modifier = Modifier.size(200.dp)
                .clip(CircleShape)
        )
        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Text(
            text = "David Gómez",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Text(
            text = "Desarrollador Móvil Jr.",
            fontSize = 25.sp,
            color = Color.Blue
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 15.dp),
            thickness = 1.dp,
            color = Color.LightGray
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                modifier = Modifier.padding(start = 15.dp),
                text = "EDAD",
                fontSize = 17.sp,
                color = Color.Gray.copy(alpha = 0.6f)
            )

            Spacer(
                modifier = Modifier.height(5.dp)
            )
            Text(
                modifier = Modifier.padding(start = 15.dp),
                text = "18 años",
                fontSize = 20.sp,
            )
            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Text(
                modifier = Modifier.padding(start = 15.dp),
                text = "CORREO",
                fontSize = 17.sp,
                color = Color.Gray.copy(alpha = 0.6f)
            )
            Spacer(
                modifier = Modifier.height(5.dp)
            )

            Text(
                modifier = Modifier.padding(start = 15.dp),
                text = "[email protected]",
                fontSize = 20.sp,
                color = Color.Blue,
                textDecoration = TextDecoration.Underline
            )
            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Text(
                modifier = Modifier.padding(start = 15.dp),
                text = "CIUDAD",
                fontSize =17.sp,
                color = Color.Gray.copy(alpha = 0.6f)
            )
            Spacer(
                modifier = Modifier.height(5.dp)
            )

            Text(
                modifier = Modifier.padding(start = 15.dp),
                text = "Bucaramanga, Colombia",
                fontSize =20.sp
            )
        }
    }

}