package top

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cardColor

@Composable
fun PaymentMethods(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxWidth(0.50f)
            .fillMaxHeight(0.4f),
        shape = RoundedCornerShape(24.dp),
        color = cardColor
    ) {
        Column(modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp)) {
            Text(
                text = "PAYMENT METHODS",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 32.dp),
                fontFamily = Fonts.Oswald(),
                fontSize = 26.sp
            )

            PaymentItem("Paypal", "images/paypal.png", Color(0xFFf1fafe))
            Spacer(modifier = Modifier.height(12.dp))
            PaymentItem("Apple", "images/apple.png", Color(0xFFececec))
            Spacer(modifier = Modifier.height(12.dp))
            PaymentItem("Google", "images/google.png", Color(0xFFf5faf5))
        }
    }
}

@Composable fun PaymentItem(
    companyName: String,
    logoUrl: String,
    bcColor: Color
) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        CompanyLogo(logoUrl, bcColor)
        Spacer(modifier = Modifier.width(16.dp))
        Text(companyName, fontSize = 18.sp, modifier = Modifier.weight(1f))
        Icon(
            Icons.Default.KeyboardArrowRight.copy(defaultWidth = 24.dp, defaultHeight = 24.dp),
        )
    }
}

@Composable fun CompanyLogo(logoUrl: String, color: Color, modifier: Modifier = Modifier) {
    Box(modifier = modifier.size(56.dp).background(color = color, shape = RoundedCornerShape(16.dp))) {
        Image(asset = imageFromResource(logoUrl), modifier = Modifier.size(32.dp).align(Alignment.Center))
    }
}