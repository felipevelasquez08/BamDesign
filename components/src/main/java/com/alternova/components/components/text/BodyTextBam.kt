package com.alternova.components.components.text

import androidx.annotation.StringRes
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
internal fun BodyTextBam(
    modifier: Modifier = Modifier,
    @StringRes textRes: Int,
    style: TextStyle = MaterialTheme.typography.bodyLarge,
    textAlign: TextAlign = TextAlign.Left,
    color: Color = Color.Unspecified
) {
    val text = stringResource(id = textRes)
    BodyTextBam(modifier, text, style, textAlign, color = color)
}

@Composable
internal fun BodyTextBam(
    modifier: Modifier = Modifier,
    text: String,
    style: TextStyle = MaterialTheme.typography.bodyLarge,
    textAlign: TextAlign = TextAlign.Left,
    color: Color = Color.Unspecified
) {
    Text(modifier = modifier, text = text, style = style, textAlign = textAlign, color = color)
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun BodyTextBamPreview() {
    BodyTextBam(text = "This is example")
}