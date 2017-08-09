package com.example.android.quakereport;

/**
 * Created by S005226 on 08/08/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;


    /*public Earthquake (String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;}*/

    public Earthquake (double magnitude, String location, long date, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = date;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }

    public String getUrl() { return mUrl; }
}

