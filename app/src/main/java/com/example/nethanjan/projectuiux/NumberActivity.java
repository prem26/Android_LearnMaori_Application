package com.example.nethanjan.projectuiux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NumberActivity extends AppCompatActivity {

    List<NumberClass> items;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Explode explode = new Explode();
        explode.setDuration(1000);
        getWindow().setEnterTransition(explode);

        setContentView(R.layout.activity_number);

        items = setupNumbers();

        ListView view = (ListView) findViewById(R.id.numerslistview);
        view.setAdapter(new CustomNumberArrayAdapter(this, items));
    }
    
    private List<NumberClass> setupNumbers(){
        List item = new ArrayList<NumberClass>();

        item.add(new NumberClass(R.drawable.ic_volume, "One", "Tahi",R.drawable.icon1, R.raw.audio_1));
        item.add(new NumberClass(R.drawable.ic_volume, "Two", "Rua",R.drawable.icon2, R.raw.audio_2));
        item.add(new NumberClass(R.drawable.ic_volume, "Three", "Toru",R.drawable.icon3, R.raw.audio_3));
        item.add(new NumberClass(R.drawable.ic_volume, "Four", "Whā",R.drawable.icon4, R.raw.audio_4));
        item.add(new NumberClass(R.drawable.ic_volume, "Five", "Rima",R.drawable.icon5, R.raw.audio_5));
        item.add(new NumberClass(R.drawable.ic_volume, "Six", "Ono",R.drawable.icon6, R.raw.audio_6));
        item.add(new NumberClass(R.drawable.ic_volume, "Seven", "Whitu",R.drawable.icon7, R.raw.audio_7));
        item.add(new NumberClass(R.drawable.ic_volume, "Eight", "Waru",R.drawable.icon8, R.raw.audio_8));
        item.add(new NumberClass(R.drawable.ic_volume, "Nine", "Iwa",R.drawable.icon9, R.raw.audio_9));
        item.add(new NumberClass(R.drawable.ic_volume, "Ten", "Tekau",R.drawable.icon10, R.raw.audio_10));

        return item;
    }
}
