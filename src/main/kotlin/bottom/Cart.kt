package bottom

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cardColor

@Composable fun Cart() {
    Surface(
        modifier = Modifier
            .fillMaxWidth(0.23f)
            .fillMaxHeight(),
        shape = RoundedCornerShape(24.dp),
        color = cardColor
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "CART",
                fontFamily = Fonts.Oswald(),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(vertical = 18.dp)
            )
            Divider(modifier = Modifier.fillMaxWidth())
            CartItem(
                imagePath = "images/red_bag.jpg",
                "Nike Elite Pro",
                "$35"
            )
            Divider(modifier = Modifier.fillMaxWidth())
            CartItem(
                imagePath = "images/brown_bag.jpg",
                "Nike Utility Elite",
                "$45"
            )
            Divider(modifier = Modifier.fillMaxWidth())
            CartItem(
                imagePath = "images/nike_shoes.jpg",
                "Zoom Air KD13",
                "$97"
            )
            Divider(modifier = Modifier.fillMaxWidth())
            CartItem(
                imagePath = "images/face_cap.jpg",
                "Nike Legacy91",
                "$18"
            )
            Divider(modifier = Modifier.fillMaxWidth())
            CartItem(
                imagePath = "images/scarf.jpg",
                "Pico Edge",
                "$15"
            )
        }
    }
}

@Composable fun CartItem(
    imagePath: String,
    itemName: String,
    price: String,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxWidth().padding(vertical = 16.dp, horizontal = 24.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Image(asset = imageFromResource(imagePath), modifier = Modifier.size(48.dp))
        Spacer(modifier = Modifier.width(16.dp))
        Text(itemName, fontSize = 16.sp, modifier =  Modifier.weight(1f))
        Text(price, fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
    }
}