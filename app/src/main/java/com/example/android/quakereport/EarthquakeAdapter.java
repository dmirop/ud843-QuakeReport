package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by S005226 on 08/08/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    public View getView(int position, View convertview, ViewGroup parent){
        View listItemView = convertview;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeTextView.setText(currentEarthquake.getMagnitude());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        locationTextView.setText(currentEarthquake.getLocation());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(currentEarthquake.getDate());

        return listItemView;
    }
}
