package com.example.nethanjan.projectuiux;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorActivity extends AppCompatActivity {

    List<ColorClass> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Explode explode = new Explode();
        explode.setDuration(1000);
        getWindow().setEnterTransition(explode);

        setContentView(R.layout.activity_color);

        items = setupColors();

        ListView view = (ListView) findViewById(R.id.colorlistview);
        view.setAdapter(new CustomColorArrayAdapter(this, items));
    }

    private List<ColorClass> setupColors(){
        List item = new ArrayList<ColorClass>();


        item.add(new ColorClass(R.drawable.ic_volume, "Yellow", "Kōwhai", Color.rgb(255, 255, 153), R.raw.audio_yellow));
        item.add(new ColorClass(R.drawable.ic_volume, "Pink", "Māwhero", Color.rgb(255, 153, 255), R.raw.audio_pink));
        item.add(new ColorClass(R.drawable.ic_volume, "Red", "Whero", Color.rgb(255, 102, 102), R.raw.audio_red));
        item.add(new ColorClass(R.drawable.ic_volume, "Blue", "Kikorangi",Color.rgb(128, 170, 255), R.raw.audio_blue));
        item.add(new ColorClass(R.drawable.ic_volume, "Orange", "Karaka",Color.rgb(255, 140, 26), R.raw.audio_orange));
        item.add(new ColorClass(R.drawable.ic_volume, "Green", "Kākāriki", Color.rgb(153, 255, 153 ), R.raw.audio_green));
        item.add(new ColorClass(R.drawable.ic_volume, "Purple", "Tawa", Color.rgb(179, 102, 255), R.raw.audio_purple));

        return item;
    }
}
