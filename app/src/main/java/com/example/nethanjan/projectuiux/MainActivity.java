package com.example.nethanjan.projectuiux;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TransitionInflater inflater = TransitionInflater.from(this);
        Transition transition = inflater.inflateTransition(R.transition.main_activity_transition);
        getWindow().setExitTransition(transition);

        setContentView(R.layout.activity_main);

        CardView number = (CardView) findViewById(R.id.numbercard);
        CardView family = (CardView) findViewById(R.id.familycard);
        CardView color = (CardView) findViewById(R.id.colorcard);

        number.setOnClickListener(new clickEvent());
        family.setOnClickListener(new clickEvent());
        color.setOnClickListener(new clickEvent());

    }

    class clickEvent implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = null;
            ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity)view.getContext(), null);
            if(view.getId() == R.id.numbercard){
                intent = new Intent(getBaseContext(),NumberActivity.class);
            }else if(view.getId() == R.id.familycard){
                intent = new Intent(getBaseContext(),FamilyActivity.class);
            }else{
                intent = new Intent(getBaseContext(),ColorActivity.class);
            }
            startActivity(intent,compat.toBundle());
        }

    }
}
