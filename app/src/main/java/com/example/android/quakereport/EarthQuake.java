package com.example.android.quakereport;

/**
 * Created by Android on 15/04/2018.
 */

public class EarthQuake {

    private double Magnitude ;
    private String Location ;
    private long Time ;

    public EarthQuake(double magnitude, String location, long time) {
        Magnitude = magnitude;
        Location = location;
        Time = time;
    }

    public double getMagnitude() {
        return Magnitude;
    }

    public void setMagnitude(double magnitude) {
        Magnitude = magnitude;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public long getTime() {
        return Time;
    }

    public void setTime(long time) {
        Time = time;
    }


}
