package com.example.abhishek.smush;



/**
 *
 * Edited by protino
 */



public class Song {

    public String id;
    public String name;
    public int time_duration;
    public String artist_name;
    public String full_path;
    public int[ ]  trade_secret;

    public Song( String id,
                 String name,
                 int time_duration,
                 String artist_name,
                 String full_path,
                 int[] trade_secret) {

        this.id = id;
        this.name = name;
        this.time_duration = time_duration;
        this.artist_name = artist_name;
        this.full_path = full_path;
        this.trade_secret = trade_secret;

    }

}
