import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import bottom.BottomRow

fun main() = Window(title = "", size = IntSize(1400, 920)) {
    DesktopMaterialTheme(
        typography = MaterialTheme.typography
    ) {
        Surface(color = mainBackgroundColor) {
            Column(modifier = Modifier.fillMaxSize().padding(32.dp)) {
                TopLayer()
                Spacer(modifier = Modifier.height(40.dp))
                BottomRow(modifier = Modifier.fillMaxWidth().weight(0.60f))
            }
        }
    }
}