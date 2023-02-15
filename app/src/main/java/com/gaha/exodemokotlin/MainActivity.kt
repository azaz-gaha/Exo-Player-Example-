package com.gaha.exodemokotlin

import android.database.DatabaseUtils
import android.media.MediaPlayer
import android.media.browse.MediaBrowser.MediaItem
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.gaha.exodemokotlin.databinding.ActivityMainBinding
import com.google.android.exoplayer2.ExoPlayer

 class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = setContentView(this,R.layout.activity_main)
        var exoPlayer = ExoPlayer.Builder(baseContext).build()
        binding.playView.player = exoPlayer


        val uri   = Uri.parse(intent.getStringExtra("url"))
        val mediaItem = com.google.android.exoplayer2.MediaItem.fromUri(uri);
        exoPlayer.addMediaItem(mediaItem)
        exoPlayer.prepare()
        exoPlayer.play()


    }
}