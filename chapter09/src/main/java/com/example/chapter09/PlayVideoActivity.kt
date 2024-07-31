package com.example.chapter09

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView

class PlayVideoActivity : AppCompatActivity() {
    private lateinit var videoView: VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_video)

        val uri = Uri.parse("android.resource://$packageName/${R.raw.video}")
        videoView = findViewById(R.id.videoView)
        videoView.setVideoURI(uri)
        val play: Button = findViewById(R.id.play)
        play.setOnClickListener {
            if (!videoView.isPlaying) {
                videoView.start()
            }
        }

        val pause: Button = findViewById(R.id.pause)
        pause.setOnClickListener {
            if (videoView.isPlaying){
                videoView.pause()
            }
        }
        val replay:Button=findViewById(R.id.replay)
        replay.setOnClickListener {
            if (videoView.isPlaying){
                videoView.resume()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        videoView.suspend()
    }
}