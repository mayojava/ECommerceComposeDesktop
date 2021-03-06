package bottom

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable fun BottomRow(modifier: Modifier = Modifier) {
    Row (modifier = modifier) {
        Cart()
        Spacer(modifier = Modifier.width(48.dp))
        SearchAndFilter()
        Spacer(modifier = Modifier.width(48.dp))
        ItemImagePane()
    }
}