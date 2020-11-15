package top.graph

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import selectedBarColor
import unselectedBarColor

@Composable fun VerticalDivider(height: Dp) {
    Box(
        Modifier
            .width(1.dp)
            .height(height)
            .background(color = MaterialTheme.colors.onSurface.copy(alpha = 0.1f))
    )
}

@Composable fun BarRow(fillBarColor: Color = unselectedBarColor, value: Float) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.Center),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            (1..7).forEach { _ -> VerticalDivider(16.dp) }
        }

        Spacer(modifier = Modifier
            .fillMaxWidth(value)
            .offset(x=-4.dp)
            .background(color = fillBarColor, shape = MaterialTheme.shapes.small)
            .height(8.dp)
            .align(Alignment.CenterStart)
        )
    }
}

@Composable fun NoBarRow() {
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Spacer(modifier = Modifier.width(18.dp))
        (1..7).forEach { _ -> VerticalDivider(8.dp) }
    }
}

@Composable fun GraphArea(modifier: Modifier) {
    Column(modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        MonthValueRow("Jun", 0.72f)
        NoBarRow()
        MonthValueRow("May", 0.40f)
        NoBarRow()
        MonthValueRow("Apr", 0.95f, isSelected = true)
        NoBarRow()
        MonthValueRow("Mar", 0.7f)
        NoBarRow()
        MonthValueRow("Feb", 0.6f)
        NoBarRow()
        MonthValueRow("Jan", 0.28f)
    }
}

@Composable fun MonthValueRow(month: String, value: Float, isSelected: Boolean = false) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text(month, fontSize = 12.sp, fontWeight = FontWeight.Light, modifier = Modifier.width(32.dp))
        Spacer(modifier = Modifier.width(32.dp))
        BarRow(value = value , fillBarColor =  if (isSelected) selectedBarColor else unselectedBarColor)
    }
}