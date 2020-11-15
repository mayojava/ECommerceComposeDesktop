package bottom

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cardColor

@Composable fun Size(modifier: Modifier) {
    Surface(
        modifier = modifier.fillMaxHeight(0.8f),
        shape = RoundedCornerShape(24.dp),
        color = cardColor
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "SIZE",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                fontFamily = Fonts.Oswald(),
                modifier = Modifier.padding(vertical = 22.dp)
            )

            Column(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    SizeItem("1", modifier = Modifier.weight(1f))
                    SizeItem("1.5", modifier = Modifier.weight(1f), filled = true)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    SizeItem("2", modifier = Modifier.weight(1f))
                    SizeItem("2.5", modifier = Modifier.weight(1f))
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    SizeItem("3", modifier = Modifier.weight(1f), filled = true)
                    SizeItem("3.5", modifier = Modifier.weight(1f))
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    SizeItem("4", modifier = Modifier.weight(1f))
                    SizeItem("4.5", modifier = Modifier.weight(1f))
                }
                OutlinedButton(
                    onClick = {},
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.fillMaxWidth().height(84.dp).padding(vertical = 16.dp, horizontal = 18.dp)
                ) {
                    Text(text = "More", fontSize = 18.sp, color = Color.Black)
                }

            }
        }
    }
}

@Composable
private fun SizeItem(text: String, modifier: Modifier, filled: Boolean = false) {
    if (filled) {
        Button(
            onClick = {},
            colors = ButtonConstants.defaultButtonColors(backgroundColor = Color.Black),
            modifier = modifier,
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text, color = Color.White)
        }
    } else {
        OutlinedButton(
            onClick = {},
            modifier = modifier,
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text, color = Color.Black)
        }
    }
}