package co.jp.core.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import co.jp.core.R
import co.jp.core.theme.appColors

@Composable
fun AppToolbar(
    title: String = stringResource(R.string.app_name),
    customTitle: @Composable (() -> Unit)? = null
) {
    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = Color.Cyan
    ) {
        if (customTitle != null) {
            customTitle()
        } else {
            Text(
                text = title,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
    }
}
