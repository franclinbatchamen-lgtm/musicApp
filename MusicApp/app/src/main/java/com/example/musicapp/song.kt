package com.example.musicapp

import android.util.Log

class song (songName: String, songArtist: String, songYear: Int, songDuration: Double) {

    //adding variables for the object's attributes
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: Double = 0.0

    constructor(songName: String, songDuration: Double) : this(songName, "", 0, songDuration ) {
    }

    //secondary constructor just in case the user doesn't input a year or duration
    constructor(songName: String, songArtist: String) : this(songName, songArtist, 0, 0.0) {
    }

    // initialising the variables for attribute for the song objects
    init{
        name = songName
        artist = songArtist
        year = songYear
        duration = songDuration
    }


    // function to play song
    fun Play() {
        Log.v("Song", "$name is playing")
    }

    // function to pause song
    fun Pause() {
        Log.v("Song", "$name is paused")
        // function to stop song
    }
    // function to stop song
    fun Stop() {
        Log.v("Song", "$name stopped now")
    }

    // function to favorite song
    fun Favorite(): Boolean {
        Log.v("Song", "$name is a favorite")
        return true
    }
    // add function to display song attributes
    fun DisplaySongs() : String {
        return "$name, $artist, ($duration)"
    }

}










