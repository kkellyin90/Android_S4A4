package com.funapp.session4assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridCustom extends AppCompatActivity {
String[] version = {"Gingerbread", "Honeycomb", "IcecreamSandwich", "Jellybean", "KitKat", "Lollipop"};
    Integer[] image = {
        R.drawable.gingerbread,
        R.drawable.honeycomb,
        R.drawable.icecreamsandwich,
        R.drawable.jellybean,
        R.drawable.kitkat,
        R.drawable.lollipop };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_custom);

        CustomAdapter adapter = new CustomAdapter(this, version, image);

        GridView grid = (GridView) findViewById(R.id.gridAndroid);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Selecteditem = version[+position];
                Toast.makeText(GridCustom.this, Selecteditem, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
