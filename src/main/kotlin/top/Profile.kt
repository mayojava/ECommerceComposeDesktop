package top

import accentColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cardColor

@Composable
fun Profile(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxWidth(0.85f)
            .fillMaxHeight(0.4f),
        shape = RoundedCornerShape(24.dp),
        color = cardColor
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            ProfileImage()
            NameTag()
            Box(modifier = Modifier.background(color = accentColor, shape = RoundedCornerShape(16.dp))) {
                Text(
                    text = "SELLER",
                    color = Color.White,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 12.dp).align(Alignment.Center),
                    fontSize = 12.sp
                )
            }
            Divider(modifier = Modifier.fillMaxWidth())
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ProfileItem("SOLD", "1355")
                ProfileItem("ITEMS", "450")
                ProfileItem("RANK", "145")
            }
        }
    }
}

@Composable fun NameTag() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(4.dp)) {
        Text("GABRIEL CASEY", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("Lake Donie", fontSize = 14.sp, color = Color(0xFF9e9f9e))
    }
}

@Composable fun ProfileItem(title: String, value: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(2.dp)) {
        Text(title, fontSize = 10.sp, color = Color(0xFFc5c6c5))
        Text(value, fontSize = 24.sp)
    }
}

@Composable fun ProfileImage(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.size(84.dp).background(color = Color.Transparent, shape = CircleShape)) {
        Image(imageFromResource("images/profile_image.jpg"), modifier = Modifier.clip(CircleShape))
    }
}