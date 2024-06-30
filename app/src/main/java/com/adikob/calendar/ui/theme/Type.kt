package com.adikob.calendar.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.adikob.calendar.R

object AppFont {
    val workSansFamily = FontFamily(
        Font(R.font.worksans_extra_bold, FontWeight.ExtraBold),
        Font(R.font.worksans_bold, FontWeight.Bold),
        Font(R.font.worksans_semibold, FontWeight.SemiBold),
        Font(R.font.worksans_medium, FontWeight.Medium),
        Font(R.font.worksans_regular, FontWeight.Normal),
        Font(R.font.worksans_light, FontWeight.Light),
        Font(R.font.worksans_thin, FontWeight.Thin)
    )

    val publicSansFamily = FontFamily(
        Font(R.font.publicsans_extrabold, FontWeight.ExtraBold),
        Font(R.font.publicsans_bold, FontWeight.Bold),
        Font(R.font.publicsans_semibold, FontWeight.SemiBold),
        Font(R.font.publicsans_medium, FontWeight.Medium),
        Font(R.font.publicsans_regular, FontWeight.Normal),
        Font(R.font.publicsans_light, FontWeight.Light),
        Font(R.font.publicsans_thin, FontWeight.Thin)
    )
}

// Set of Material typography styles to start with
private val defaultTypography = Typography()
val Typography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = AppFont.publicSansFamily),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = AppFont.publicSansFamily),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = AppFont.publicSansFamily),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = AppFont.workSansFamily),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = AppFont.workSansFamily),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = AppFont.workSansFamily),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = AppFont.workSansFamily),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = AppFont.workSansFamily),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = AppFont.workSansFamily),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = AppFont.publicSansFamily),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = AppFont.publicSansFamily),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = AppFont.publicSansFamily),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = AppFont.publicSansFamily),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = AppFont.publicSansFamily),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = AppFont.publicSansFamily)
)
