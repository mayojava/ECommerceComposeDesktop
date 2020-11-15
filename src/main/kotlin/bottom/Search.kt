package bottom

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cardColor

@Composable fun SearchBar() {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp),
        shape = RoundedCornerShape(24.dp),
        color = cardColor) {

        Row(modifier =  Modifier.fillMaxWidth().padding(horizontal = 18.dp), verticalAlignment = Alignment.CenterVertically) {
            Text("Search", modifier = Modifier.weight(1f), color = Color(0xFfadaead))
            Icon(Icons.Default.Search.copy(defaultHeight = 32.dp, defaultWidth = 32.dp), tint = Color(0xFF9e9f9e))
        }
    }
}
