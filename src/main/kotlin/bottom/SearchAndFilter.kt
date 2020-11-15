package bottom

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchAndFilter() {
    Column(
        modifier = Modifier.fillMaxHeight(0.95f).fillMaxWidth(0.55f),
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Brand(modifier = Modifier.weight(1f))
            Spacer(modifier = Modifier.width(48.dp))
            Size(modifier = Modifier.weight(1f))
        }
        SearchBar()
    }
}
