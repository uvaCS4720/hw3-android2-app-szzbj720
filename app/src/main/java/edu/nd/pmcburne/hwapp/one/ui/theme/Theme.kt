package edu.nd.pmcburne.hwapp.one.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,

    // Baby blue background also applied in dark mode (optional, but consistent)
    background = BabyBlueBg,
    surface = BabyBlueBg,
    surfaceVariant = BabyBlueSurface,
    primaryContainer = BabyBlueContainer,
    onBackground = BabyBlueOn,
    onSurface = BabyBlueOn
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,

    background = BabyBlueBg,
    surface = BabyBlueBg,
    surfaceVariant = BabyBlueSurface,
    primaryContainer = BabyBlueContainer,
    onBackground = BabyBlueOn,
    onSurface = BabyBlueOn
)

@Composable
fun HWStarterRepoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Set false by default so your baby-blue theme always shows.
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}