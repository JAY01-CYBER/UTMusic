package com.example.utmusic.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.utmusic.data.models.Song
import com.example.utmusic.player.MusicPlayer
import com.example.utmusic.ui.components.*

@Composable
fun HomeScreen() {

    val context = LocalContext.current

    val player = remember {

        MusicPlayer(context)

    }

    var currentSong by remember {

        mutableStateOf<Song?>(null)

    }

    val songs = listOf(

        Song(
            "Test Song 1",
            "Artist",
            "",
            "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3"
        ),

        Song(
            "Test Song 2",
            "Artist",
            "",
            "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-2.mp3"
        )

    )

    Column {

        LazyColumn(

            modifier = Modifier.weight(1f)

        ) {

            items(songs) {

                SongItem(

                    song = it,

                    onPlay = { song ->

                        player.play(song.url)

                        currentSong = song

                    }

                )

            }

        }

        currentSong?.let {

            MiniPlayer(it)

        }

    }

}
