package co.jp.core.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.jp.core.theme.AppTheme
import co.jp.core.theme.appGray01Color
import co.jp.core.theme.dimen24dp
import co.jp.core.theme.textStyleCaption
import co.jp.core.theme.textStyleTitle

@Composable
fun CommonAlertDialog(
    title: String,
    message: String,
    confirmButtonText: String,
    onDismissRequest: () -> Unit,
    onClickConfirmButton: () -> Unit
) {
    AlertDialog(
        onDismissRequest = {
            onDismissRequest()
        },
        title = {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = title,
                    style = textStyleTitle,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        },
        text = {
            Spacer(Modifier.height(dimen24dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = message,
                    style = textStyleCaption,
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
        },
        confirmButton = {
            DialogButton(confirmButtonText) {
                onClickConfirmButton()
            }
        },
        modifier = Modifier
            .height(220.dp)
            .width(270.dp),
        backgroundColor = appGray01Color
    )
}

@Composable
private fun DialogButton(
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = {
                onClick()
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White
            ),
            modifier = Modifier
                .height(40.dp)
                .width(140.dp)
        ) {
            Text(
                text = text,
                style = textStyleCaption,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview
@Composable
fun PreviewDialogButton() {
    DialogButton("キャンセル") {}
}

data class DialogButtonParam(
    val text: String,
    val onClick: () -> Unit
)

@Composable
fun CommonAlertDialog(
    title: String? = null,
    message: String? = null,
    confirmButton: DialogButtonParam,
    dismissButton: DialogButtonParam? = null,
    onDismissRequest: (() -> Unit)? = null
) {
    AlertDialog(
        onDismissRequest = {
            onDismissRequest?.invoke()
        },
        title = title?.let {
            @Composable {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = title,
                    style = textStyleTitle,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        },
        text = {
            Spacer(Modifier.height(dimen24dp))
            message?.let {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = message,
                        style = textStyleCaption,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                }
            }
        },
        buttons = {
            // 決定・OKなど
            DialogButton(confirmButton.text) {
                confirmButton.onClick()
            }
            Spacer(Modifier.height(dimen24dp))

            if (dismissButton != null) {
                // キャンセルなど
                DialogButton(dismissButton.text) {
                    dismissButton.onClick()
                }
                Spacer(Modifier.height(dimen24dp))
            }
        },
        backgroundColor = Color.Black
    )
}

@Preview
@Composable
fun PreviewCommonDialogConfirmDismiss() {
    AppTheme {
        Box(
            Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            CommonAlertDialog(
                title = "タイトル",
                message = "メッセージ",
                confirmButton = DialogButtonParam(
                    "OK"
                ) {},
                dismissButton = DialogButtonParam(
                    "キャンセル"
                ) {}
            )
        }
    }
}
