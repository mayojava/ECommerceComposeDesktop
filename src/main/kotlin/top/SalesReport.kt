package top

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cardColor
import downTickerColor
import textColor
import top.graph.GraphArea
import upTickerColor

@Composable
fun SalesReport() {
    Surface(
        modifier = Modifier
            .fillMaxWidth(0.45f)
            .fillMaxHeight(0.4f),
        shape = RoundedCornerShape(24.dp),
        color = cardColor
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxHeight()
                    .fillMaxWidth(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "SALES\nREPORT",
                    style = MaterialTheme.typography.h4.copy(fontSize = 32.sp, fontFamily = Fonts.Oswald()),
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.align(Alignment.Start)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Divider(modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(16.dp))
                ReportItem(4570, "SALES", true)
                Spacer(modifier = Modifier.height(32.dp))
                ReportItem(1210, "RETURNS", false)
            }

            Spacer(modifier = Modifier.width(24.dp))
            Box(
                Modifier
                    .preferredWidth(1.dp)
                    .fillMaxHeight()
                    .background(color = MaterialTheme.colors.onSurface.copy(alpha = 0.12f))
            )
            Spacer(modifier = Modifier.width(32.dp))
            GraphArea(modifier = Modifier.padding(vertical = 20.dp))
        }
    }
}

@Composable
fun ReportItem(
    amount: Int, subtitle: String,
    isPositive: Boolean,
    modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Column {
            Text(
                text = "$amount",
                fontWeight = FontWeight.ExtraBold,
                style = MaterialTheme.typography.h4.copy(fontSize = 36.sp),
                color = textColor
            )
            Text(text = subtitle, fontSize = 10.sp, color = Color(0xFFa8a9a8))
        }
        Spacer(modifier = Modifier.width(32.dp))
        Icon(
            asset = if (isPositive) {
                Icons.Default.KeyboardArrowUp.copy(defaultHeight = 24.dp, defaultWidth = 24.dp)
            } else {
                Icons.Default.KeyboardArrowDown.copy(defaultHeight = 24.dp, defaultWidth = 24.dp)
            },
            tint = if (isPositive) upTickerColor else downTickerColor
        )
    }
}
