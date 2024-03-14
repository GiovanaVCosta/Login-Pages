package com.example.mytrips

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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaSp()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(150.dp)
                        .background(
                            color = Color(0xFFCF06F0),
                            shape = RoundedCornerShape(
                                bottomStart = 16.dp
                            )
                        )
                )
            }

            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "Login",
                    fontSize = 60.sp,
                    color = Color(0xFFCF06F0),
                    fontWeight = FontWeight.ExtraBold,
                )
                Text(
                    text = "Please sign in to continue.",
                    fontSize = 16.sp,
                    color = Color.Gray,
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Row {
                            Image(
                                painterResource(id = R.drawable.email),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .align(Alignment.CenterVertically)

                            )
                            Text(
                                text = "  Email",
                                color = Color.Black
                            )
                        }

                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0)
                    ),
                    shape = RoundedCornerShape(
                        16.dp
                    ),
                    modifier = Modifier
                        .padding(
                            top = 80.dp
                        )
                        .fillMaxWidth()
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Row {
                            Image(
                                painterResource(id = R.drawable.lock),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .align(Alignment.CenterVertically)
                            )
                            Text(
                                text = "  Password",
                                color = Color.Black
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0)
                    ),
                    shape = RoundedCornerShape(
                        16.dp
                    ),
                    modifier = Modifier
                        .padding(
                            top = 20.dp
                        )
                        .fillMaxWidth()
                )
            }

            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .offset(y = -70.dp),
                horizontalAlignment = Alignment.End
            ) {
                Button(

                    modifier = Modifier
                        .height(50.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xFFCF06F0)
                        ),
                    shape = RoundedCornerShape(
                        12.dp
                    )


                ) {
                    Row {
                        Text(
                            text = "SIGN IN   ",
                            fontSize = 18.sp,
                            color = Color.White
                        )
                        Image(
                            painterResource(id = R.drawable.seta),
                            contentDescription = "",
                            modifier = Modifier
                                .width(15.dp)
                                .height(15.dp)
                                .align(Alignment.CenterVertically)


                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .padding(top = 20.dp)
                ) {
                    Text(
                        text = "Don’t have an account? ",
                        fontSize = 13.sp,
                        color = Color.Gray,
                    )
                    Text(
                        text = "Sign up",
                        fontSize = 13.sp,
                        color = Color(0xFFCF06F0),
                        fontWeight = FontWeight.ExtraBold
                    )
                }


            }


            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(150.dp)
                        .background(
                            color = Color(0xFFCF06F0),
                            shape = RoundedCornerShape(
                                topEnd = 16.dp
                            )
                        )
                )
            }
        }
    }
}


@Composable
fun TelaSp() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(150.dp)
                        .background(
                            color = Color(0xFFCF06F0),
                            shape = RoundedCornerShape(
                                bottomStart = 16.dp
                            )
                        )
                )
            }

            Column(
                modifier = Modifier
                    .offset(y = -20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Login",
                    fontSize = 50.sp,
                    color = Color(0xFFCF06F0),
                    fontWeight = FontWeight.ExtraBold,
                )
                Text(
                    text = "Please sign in to continue.",
                    fontSize = 14.sp,
                    color = Color.Gray,
                )

                Card(
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(Color(0xfff5f5f8)),
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .width(100.dp)
                        .height(100.dp)
                        .border(
                            width = 1.dp,
                            color = Color(0xFFCF06F0),
                            shape = RoundedCornerShape(100.dp),
                            )

                    ) {
                    Image(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(70.dp)
                            .offset(y = 10.dp),


                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "Imagem de um homem sorrindo",
                        contentScale = ContentScale.Crop,


                    )

                }

                Image(
                    painterResource(
                        id = R.drawable.photo),
                    contentDescription = "",
                    modifier = Modifier
                        .offset(y = -20.dp, x = 35.dp)
                        .width(100.dp)
                        .height(20.dp)
                )

            }
            Column(
                modifier = Modifier
                    .width(350.dp)
                    .offset(y = -60.dp)
            ) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Row {
                            Image(
                                painterResource(id = R.drawable.user),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .align(Alignment.CenterVertically)

                            )
                            Text(
                                text = "  Username",
                                color = Color.Black
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0)
                    ),
                    shape = RoundedCornerShape(
                        16.dp
                    ),
                    modifier = Modifier
                        .padding(
                            top = 20.dp
                        )
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Row {
                            Image(
                                painterResource(id = R.drawable.celular),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .align(Alignment.CenterVertically)


                            )
                            Text(
                                text = "  Phone",
                                color = Color.Black
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0)
                    ),
                    shape = RoundedCornerShape(
                        16.dp
                    ),
                    modifier = Modifier
                        .padding(
                            top = 10.dp
                        )
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Row {
                            Image(
                                painterResource(id = R.drawable.email),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .align(Alignment.CenterVertically)

                            )
                            Text(
                                text = "  Email",
                                color = Color.Black
                            )
                        }

                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0)
                    ),
                    shape = RoundedCornerShape(
                        16.dp
                    ),
                    modifier = Modifier
                        .padding(
                            top = 10.dp
                        )
                        .fillMaxWidth()
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Row {
                            Image(
                                painterResource(id = R.drawable.lock),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .align(Alignment.CenterVertically)


                            )
                            Text(
                                text = "  Password",
                                color = Color.Black
                            )
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0)
                    ),
                    shape = RoundedCornerShape(
                        16.dp
                    ),
                    modifier = Modifier
                        .padding(
                            top = 10.dp
                        )
                        .fillMaxWidth()
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = false,
                        onCheckedChange = {},
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFFCF06F0),
                            uncheckedColor = Color(0xFFCF06F0)
                        )
                    )
                    Text(text = "Over 18?")
                }

                Button(
                    modifier = Modifier
                        .fillMaxWidth(),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xFFCF06F0)
                        ),
                    shape = RoundedCornerShape(
                        12.dp
                    )

                ) {
                    Text(
                        text = "CREATE ACCOUNT",
                        fontSize = 18.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold
                    )

                }

                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "SIGN IN   ",
                            fontSize = 18.sp,
                            color = Color.White
                        )
                        Image(
                            painterResource(id = R.drawable.seta),
                            contentDescription = ""
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = "Already have an account? ",
                            fontSize = 13.sp,
                            color = Color.Gray,
                        )
                        Text(
                            text = "Sign in",
                            fontSize = 13.sp,
                            color = Color(0xFFCF06F0),
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }


            }

        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)
                    .background(
                        color = Color(0xFFCF06F0),
                        shape = RoundedCornerShape(
                            topEnd = 16.dp
                        )
                    )
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripsTheme {
        Greeting()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Tela2Preview() {
    MyTripsTheme {
        TelaSp()
    }
}





