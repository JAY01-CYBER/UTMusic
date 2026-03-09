package com.example.utmusic.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.utmusic.data.models.Song

@Composable
fun MiniPlayer(song: Song) {

    Card(

        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)

    ) {

        Row(

            modifier = Modifier
                .padding(10.dp)

        ) {

            Column(

                modifier = Modifier.weight(1f)

            ) {

                Text(song.title)

                Text(song.artist)

            }

            Text("Playing")

        }

    }

}
