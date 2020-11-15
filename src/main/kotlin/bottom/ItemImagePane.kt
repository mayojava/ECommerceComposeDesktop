package bottom

import accentColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cardColor
import indicatorBlue
import indicatorBrown
import indicatorYellow

@Composable fun ItemImagePane() {
    Surface(
        modifier = Modifier
            .fillMaxWidth(0.90f)
            .fillMaxHeight(),
        shape = RoundedCornerShape(24.dp),
        color = cardColor
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(vertical = 30.dp, horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "RUNNING SHOE", color = Color(0xFFadaead))
            Text(text = "REACT INFINITY", fontSize = 32.sp, fontWeight = FontWeight.Bold, fontFamily = Fonts.Oswald())
            Text(text = "RUN FLYKNIT", fontSize = 32.sp, fontWeight = FontWeight.Bold, fontFamily = Fonts.Oswald())
            Image(imageResource("images/running_shoes.png"), modifier = Modifier.size(240.dp))
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Row(modifier = Modifier.weight(1f), horizontalArrangement = Arrangement.spacedBy(12.dp)){
                    Box(modifier = Modifier.background(color = indicatorBlue, shape = CircleShape).size(24.dp))
                    Box(modifier = Modifier.background(color = indicatorYellow, shape = CircleShape).size(24.dp))
                    Box(modifier = Modifier.background(color = indicatorBrown, shape = CircleShape).size(24.dp))
                }
                Box(modifier = Modifier.background(color = accentColor, shape = CircleShape).size(64.dp)) {
                    Icon(
                        Icons.Default.PlayArrow.copy(defaultWidth = 36.dp, defaultHeight = 36.dp),
                        tint = Color.White,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
        }
    }
}