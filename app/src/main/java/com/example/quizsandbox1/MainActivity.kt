package com.example.quizsandbox1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizsandbox1.ui.theme.Quizsandbox1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quizsandbox1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Dasbor()
                }
            }
        }
    }
}

@Composable
fun Dasbor() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val hsisakinah = painterResource(R.drawable.hsisakinah)
        Image(
            painter = hsisakinah,
            contentDescription = null,
            modifier = Modifier.width(70.dp)
        )

        Column (
            modifier = Modifier
                .padding(10.dp)
                .background(
                    color = colorResource(R.color.abu),
                    shape = RoundedCornerShape(3)

                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.judul),
                fontSize = 17.sp,
                modifier = Modifier.padding(10.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.isi),
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                textAlign = TextAlign.Center,
                color = Color.DarkGray
            )


            val caridokumen = painterResource(R.drawable.caridata)
            Image(
                painter = caridokumen,
                contentDescription = null,
                modifier = Modifier.padding(top=20.dp),
                Alignment.Center
            )

            Row (
                modifier = Modifier
                    .padding(20.dp)
            )
            {

                Column {
                    Box(
                        modifier = Modifier
                            .padding(end = 5.dp, top = 5.dp)
                            .width(120.dp)
                            .background(
                                color = Color.Transparent,
                                shape = RoundedCornerShape(20)
                            )
                            .border(
                                width = 1.4.dp,
                                color = colorResource(R.color.dongker),
                                shape = RoundedCornerShape(30)
                            )


                    ) {
                        Text(
                            text = stringResource(R.string.lewati),
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            color = colorResource(R.color.dongker),
                            modifier = Modifier
                                .width(120.dp)
                                .padding(10.dp)

                        )
                    }

                }
                Column {
                    Box(
                        modifier = Modifier
                            .padding(start = 5.dp, top = 5.dp)
                            .width(120.dp)
                            .background(
                                color = colorResource(R.color.dongker),
                                shape = RoundedCornerShape(30)
                            )


                    ) {

                        Text(
                            text = stringResource(R.string.isicv),
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .width(120.dp)
                                .padding(10.dp)

                        )
                    }

                }
            }
        }
    }

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 20.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(top = 0.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 0.dp, end = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Rounded.Home,
                    contentDescription = null,
                    tint = colorResource(R.color.biru),
                    modifier = Modifier
                        .size(30.dp)
                )

                Text(
                    text = "Home",
                    color = colorResource(R.color.biru),
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(30.dp)
                )

                Text(
                    text = "Pencarian",
                    color = Color.Gray,
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 30.dp, end = 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(30.dp)
                )

                Text(
                    text = "Profil",
                    color = Color.Gray,
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Tampilan() {
    Quizsandbox1Theme {
        Dasbor()
    }
}