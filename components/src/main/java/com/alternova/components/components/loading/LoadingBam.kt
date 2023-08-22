package com.alternova.components.components.loading

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.alternova.components.R
import com.alternova.components.components.text.BodyTextBam
import com.alternova.components.ui.theme.LightGray
import com.alternova.components.ui.theme.multiplier_x18
import com.alternova.components.ui.theme.multiplier_x36
import com.alternova.components.ui.theme.multiplier_x4

@Composable
fun LoadingBam() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .background(LightGray, shape = RoundedCornerShape(multiplier_x36))
                .padding(multiplier_x18),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CircularProgressIndicator(
                color = Color.Gray,
                modifier = Modifier.padding(bottom = multiplier_x4)
            )
            BodyTextBam(textRes = R.string.loading, style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Composable
@Preview(showSystemUi = true)
private fun LoadingScreenPreview() {
    LoadingBam()
}