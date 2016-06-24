package com.funapp.session4assignment3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Keith on 6/24/2016.
 */
public class CustomAdapter extends ArrayAdapter {

    Activity context;
    String[] version;
    Integer[] picture;

public CustomAdapter(Activity context, String[] version, Integer[] picture) {
        super(context, R.layout.layout, version);
        this.context = context;
        this.version = version;
        this.picture = picture;
    }

public View getView(int position, View view, ViewGroup parent){

    LayoutInflater inflater = context.getLayoutInflater();
    View rowView = inflater.inflate(R.layout.layout,null,true);

    ImageView image = (ImageView) rowView.findViewById(R.id.imageView);
    TextView text = (TextView) rowView.findViewById(R.id.textView);

    image.setImageResource(picture[position]);
    text.setText(version[position]);
    return rowView;
}
}
