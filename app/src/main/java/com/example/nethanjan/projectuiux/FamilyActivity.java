package com.example.nethanjan.projectuiux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    List<FamilyClass> items;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Explode explode = new Explode();
        explode.setDuration(1000);
        getWindow().setEnterTransition(explode);

        setContentView(R.layout.activity_family);

        items = setupNumbers();

        ListView view = (ListView) findViewById(R.id.familylistview);
        view.setAdapter(new CustomFamilyArrayAdapter(this, items));
    }

    private List<FamilyClass> setupNumbers(){
        List item = new ArrayList<FamilyClass>();

        item.add(new FamilyClass(R.drawable.ic_volume, "Father", "Pāpā",R.drawable.icon_father, R.raw.audio_father));
        item.add(new FamilyClass(R.drawable.ic_volume, "Mother", "Whaea",R.drawable.icon_mother, R.raw.audio_mother));
        item.add(new FamilyClass(R.drawable.ic_volume, "Husband", "Tāne",R.drawable.icon_husband, R.raw.audio_husband));
        item.add(new FamilyClass(R.drawable.ic_volume, "Wife", "Wahine",R.drawable.icon_wife, R.raw.audio_wife));
        item.add(new FamilyClass(R.drawable.ic_volume, "Child", "Tamaiti",R.drawable.icon_child, R.raw.audio_child));
        item.add(new FamilyClass(R.drawable.ic_volume, "Children", "Tamarki",R.drawable.icon_children, R.raw.audio_children));
        item.add(new FamilyClass(R.drawable.ic_volume, "Son", "Tama",R.drawable.icon_son, R.raw.audio_son));
        item.add(new FamilyClass(R.drawable.ic_volume, "Daughter", "Te tāmahine",R.drawable.icon_daughter, R.raw.audio_daughter));
        item.add(new FamilyClass(R.drawable.ic_volume, "Brother", "Tungāne",R.drawable.icon_brother, R.raw.audio_brother));
        item.add(new FamilyClass(R.drawable.ic_volume, "Sister", " Tuahine",R.drawable.icon_sister, R.raw.audio_sister));

        return item;
    }
}
