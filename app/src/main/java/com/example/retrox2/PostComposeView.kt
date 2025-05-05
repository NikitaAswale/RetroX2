package com.example.retrox2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PostComposeView() {
        val postviewmodel : PostViewModel = viewModel()
        val postlist = postviewmodel.post.collectAsState().value

    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(text = postlist.userId.toString(), fontSize = 18.sp)
            Text(text = postlist.id.toString(), fontSize = 18.sp)
            Text(text = postlist.title, fontSize = 18.sp)
            Text(text = postlist.body, fontSize = 18.sp)
        }
    }
}