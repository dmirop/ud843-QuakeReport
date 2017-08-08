package com.example.android.quakereport;

/**
 * Created by S005226 on 08/08/2017.
 */

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;


    public Earthquake (String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public String getDate(){
        return mDate;
    }
}
