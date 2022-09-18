package co.jp.core.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.jp.core.R
import co.jp.core.theme.dimen8dp
import co.jp.core.theme.textStyleBody

@Composable
fun ButtonWithImage(
    @DrawableRes image: Int,
    text: String,
    backgroundColor: Color? = null,
    textColor: Color? = null,
    modifier: Modifier,
    OnClick: () -> Unit
) {
    Button(
        onClick = { OnClick.invoke() },
        modifier = modifier,
        shape = RoundedCornerShape(10),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor ?: Color.White
        )
    ) {
        Row {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = text,
                maxLines = 1,
                style = textStyleBody,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = dimen8dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewButtonWithImage() {
    ButtonWithImage(
        image = R.drawable.ic_launcher_background,
        text = stringResource(R.string.app_name),
        backgroundColor = Color.Blue,
        modifier = Modifier.fillMaxWidth(),
        OnClick = {}
    )
}
