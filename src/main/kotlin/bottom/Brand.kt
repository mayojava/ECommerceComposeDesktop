package bottom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cardColor

@Composable fun Brand(modifier: Modifier) {
    Surface(
        modifier = modifier.fillMaxHeight(0.8f),
        shape = RoundedCornerShape(24.dp),
        color = cardColor
    ) {
        Column(
            modifier = Modifier.fillMaxHeight(0.7f).fillMaxWidth(0.4f).padding(bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "BRAND",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                fontFamily = Fonts.Oswald(),
                modifier = Modifier.padding(vertical = 22.dp)
            )

            Column(
                modifier = Modifier.fillMaxWidth().padding(start = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)) {
                BrandItem("images/nike.png", "Nike")
                BrandItem("images/air_jordan.png", "Jordan")
                BrandItem("images/converse.png", "Converse")
                BrandItem("images/addidas.png", "Addidas")
            }
        }
    }
}

@Composable fun BrandItem(logoPath: String, name: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Box(modifier = modifier.size(48.dp).background(color = Color(0xFFf2f3f2), shape = RoundedCornerShape(16.dp))) {
            Image(asset = imageFromResource(logoPath), modifier = Modifier.size(32.dp).align(Alignment.Center))
        }
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = name, fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
    }
}