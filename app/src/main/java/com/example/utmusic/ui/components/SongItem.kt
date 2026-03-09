package com.example.utmusic.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.utmusic.data.models.Song

@Composable
fun SongItem(

    song: Song,

    onPlay: (Song) -> Unit

) {

    Row(

        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)

    ) {

        Column(

            modifier = Modifier
                .weight(1f)

        ) {

            Text(song.title)

            Text(song.artist)

        }

        Button(

            onClick = {

                onPlay(song)

            }

        ) {

            Text("Play")

        }

    }

}
