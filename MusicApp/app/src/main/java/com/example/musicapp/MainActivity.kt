package com.example.musicapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var songDisplayTxt = findViewById<TextView>(R.id.musicDisplayID)
        var songDisplay = ""


        var song1 = song("Promises","Maverick City", 2025, 10.46)
        var song2 = song("KELEBU", "Rema",2025,2.52)
        var song3 = song("Basquiate", "Asake")
        var song4 = song("Thank You, God", 3.53 )

        //creating array
        var songs = arrayOf<song>(song1, song2, song3, song4)

        //for loop to loop through and display items in song array
        for (song in songs){
            songDisplay += "${song.DisplaySongs()}\n\n"
        }

        songDisplayTxt.text = songDisplay


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}