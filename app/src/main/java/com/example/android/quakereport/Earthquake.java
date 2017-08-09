package com.example.android.quakereport;

/**
 * Created by S005226 on 08/08/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;


    /*public Earthquake (String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;}*/

    public Earthquake (double magnitude, String location, long date){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = date;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

/*
    public String getDate(){
        return mDate;
    }
*/

    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }
}

