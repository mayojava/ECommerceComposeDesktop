import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.text.platform.font

object Fonts  {
    @Composable fun Oswald() = fontFamily(
        font(
            alias = "Oswald",
            path = "font/Oswald_Regular.ttf",
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        ),

        font(
            alias = "Oswald",
            path = "font/Oswald_Bold.ttf",
            weight = FontWeight.Bold,
            style = FontStyle.Normal
        ),

        font(
            alias = "Oswald",
            path = "font/Oswald_Bold.ttf",
            weight = FontWeight.SemiBold,
            style = FontStyle.Normal
        ),

        font(
            alias = "Oswald",
            path = "font/Oswald_Medium.ttf",
            weight = FontWeight.Medium,
            style = FontStyle.Normal
        ),

        font(
            alias = "Oswald",
            path = "font/Oswald_Light.ttf",
            weight = FontWeight.Light,
            style = FontStyle.Normal
        ),

        font(
            alias = "Oswald",
            path = "font/Oswald_ExtraLight.ttf",
            weight = FontWeight.ExtraLight,
            style = FontStyle.Normal
        )
    )
}