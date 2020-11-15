import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import top.PaymentMethods
import top.Profile
import top.SalesReport

@Composable
fun TopRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        SalesReport()
        Spacer(modifier = Modifier.width(48.dp))
        PaymentMethods()
        Spacer(modifier = Modifier.width(48.dp))
        Profile()
    }
}
