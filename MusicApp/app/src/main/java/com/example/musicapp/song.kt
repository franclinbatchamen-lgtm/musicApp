package com.example.musicapp

import android.util.Log


class song (songName: String, songArtist: String, songYear: Int, songDuration: String) {

    //adding variables for the object's attributes
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String = ""

    //secondary constructor
    constructor(songName: String, songArtist: String) : this(songName, songArtist, 0, "") {

    }









    // initialising the variables for attribute for the song objects
    init{
        name = songName
        artist = songArtist
        year = songYear
        duration = songDuration
    }


    // funtion to play song
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

}










