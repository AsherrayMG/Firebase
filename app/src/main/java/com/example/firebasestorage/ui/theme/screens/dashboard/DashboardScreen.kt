package com.example.firebasestorage.ui.theme.screens.dashboard

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


import com.example.firebasestorage.navigation.ROUT_COLLECTIONS
import com.example.firebasestorage.ui.theme.lBlue
import com.example.firebasestorage.ui.theme.labrea
import com.example.firebasestorage.R


@Composable
fun DashboardScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        //TopAppBar
        TopAppBar(title = { Text(text = "Amazon Shop", color = labrea) },
            backgroundColor = lBlue
        )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(30.dp))
        //ROW
        Row {
           Column {
               Text(text = "Amazon", fontSize = 30.sp, fontFamily = FontFamily.Serif, color = labrea, fontWeight = FontWeight.ExtraBold)
               Text(text = "Shop from A-Z")
           }
            Spacer(modifier = Modifier.width(50.dp))
            Image(painter = painterResource(id = R.drawable.amazon), contentDescription = "amazon", modifier = Modifier.size(100.dp))

        }
    //End Of ROW
        Spacer(modifier = Modifier.height(30.dp))
       Column(
           modifier = Modifier.padding(start = 20.dp)) {
           val mContext = LocalContext.current
           //Row1
           Row {
               Card(modifier = Modifier.clickable {
                   navController.navigate(ROUT_COLLECTIONS)
                   Toast.makeText(mContext,
                       "Opening CollectionsScreen",
                       Toast.LENGTH_SHORT).show()

               }
                   .size(width = 160.dp, height = 120.dp),
                   elevation = 10.dp

               ) {
                   Column {
                       val mContext = LocalContext.current
                       Box(modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center) {
                           Image(painter = painterResource(id = R.drawable.clothing), contentDescription = "amazon")
                       }
                       Text(text = "Clothing", fontSize = 20.sp,
                           color = labrea,
                           modifier = Modifier.fillMaxWidth().clickable {  mContext.startActivity(
                               Intent(mContext,Collection::class.java)
                           ) },
                           textAlign = TextAlign.Center)

                   }

               }
               Spacer(modifier = Modifier.width(30.dp))
               //Card
               Card(modifier = Modifier.size(width = 160.dp, height = 120.dp), elevation = 10.dp) {
                   Column {
                       Box(modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center) {
                           Image(painter = painterResource(id = R.drawable.electronics), contentDescription = "amazon")
                       }
                       Text(text = "Electronics", fontSize = 20.sp,
                           color = labrea, modifier = Modifier.fillMaxWidth(),
                           textAlign = TextAlign.Center)

                   }

               }
               //End of card


           }

           //End of Row1
           Spacer(modifier = Modifier.height(20.dp))
           //Row1
           Row {
               Card(modifier = Modifier
                   .size(width = 160.dp, height = 120.dp),
                   elevation = 10.dp

               ) {
                   Column {
                       Box(modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center) {
                           Image(painter = painterResource(id = R.drawable.home), contentDescription = "amazon")
                       }
                       Text(text = "Home", fontSize = 20.sp,
                           color = labrea, modifier = Modifier.fillMaxWidth(),
                           textAlign = TextAlign.Center)

                   }

               }
               Spacer(modifier = Modifier.width(30.dp))
               //Card
               Card(modifier = Modifier.size(width = 160.dp, height = 120.dp), elevation = 10.dp) {
                   Column {
                       Box(modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center) {
                           Image(painter = painterResource(id = R.drawable.beauty), contentDescription = "amazon")
                       }
                       Text(text = "Beauty", fontSize = 20.sp,
                           color = labrea, modifier = Modifier.fillMaxWidth(),
                           textAlign = TextAlign.Center)

                   }

               }
               //End of card


           }

           //End of Row1
Spacer(modifier = Modifier.height(20.dp))
           //Row1
           Row {
               Card(modifier = Modifier
                   .size(width = 160.dp, height = 120.dp),
                   elevation = 10.dp

               ) {
                   Column {
                       Box(modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center) {
                           Image(painter = painterResource(id = R.drawable.pharmacy), contentDescription = "pharmacy")
                       }
                       Text(text = "Pharmacy", fontSize = 20.sp,
                           color = labrea, modifier = Modifier.fillMaxWidth(),
                           textAlign = TextAlign.Center)

                   }

               }
               Spacer(modifier = Modifier.width(30.dp))
               //Card
               Card(modifier = Modifier.size(width = 160.dp, height = 120.dp), elevation = 10.dp) {
                   Column {
                       Box(modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center) {
                           Image(painter = painterResource(id = R.drawable.groceries), contentDescription = "groceries")
                       }
                       Text(text = "Groceries", fontSize = 20.sp,
                           color = labrea, modifier = Modifier.fillMaxWidth(),
                           textAlign = TextAlign.Center)

                   }

               }
               //End of card


           }

           //End of Row1

       }
    }


}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    DashboardScreen(rememberNavController())
}