package co.jp.core.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NetworkImage(
    url: Any,
    modifier: Modifier,
    contentScale: ContentScale,
    contentDescription: String? = null
) {
    // Glide or Coil
}

@Preview
@Composable
fun PreviewNetworkImage() {
    NetworkImage(
        url = "",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop,
        contentDescription = ""
    )
}
