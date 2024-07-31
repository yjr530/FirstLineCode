package com.example.chapter09

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import com.example.chapter09.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as
                NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel =
                NotificationChannel("1", "Normal", NotificationManager.IMPORTANCE_DEFAULT)
            manager.createNotificationChannel(channel)

            val channel2 =
                NotificationChannel("important", "Important", NotificationManager.IMPORTANCE_HIGH)
            manager.createNotificationChannel(channel2)
        }

        binding.sendNotice.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            val pi = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)

            val notification = NotificationCompat.Builder(this, "1")
//            val notification = NotificationCompat.Builder(this, "important")
                .setContentTitle("This is content title")
//                .setContentText("This is content text")
                .setContentText("Learn how to build notifications, send and sync data, and use voice actions.Get the official Android IDE and developer tools to build apps for Android.")
                .setSmallIcon(R.drawable.ic_mango)
                .setLargeIcon(
                    BitmapFactory.decodeResource(
                        resources,
                        R.drawable.ic_user_avatar
                    )
                )
                .setContentIntent(pi)
//                .setAutoCancel(true)
//                .setStyle(NotificationCompat.BigTextStyle().bigText("Learn how to build notifications, send and sync data, and use voice actions.Get the official Android IDE and developer tools to build apps for Android."))
                .setStyle(
                    NotificationCompat.BigPictureStyle().bigPicture(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.big_image
                        )
                    )
                )
                .build()
            manager.notify(1, notification)
        }
//        val intent=Intent(this,CameraAlbumActivity::class.java)
//        val intent = Intent(this, PlayAudioActivity::class.java)
//        val intent = Intent(this, PlayVideoActivity::class.java)
//        startActivity(intent)
    }
}