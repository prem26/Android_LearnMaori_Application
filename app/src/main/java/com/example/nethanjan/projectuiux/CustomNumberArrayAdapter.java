package com.example.nethanjan.projectuiux;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomNumberArrayAdapter extends ArrayAdapter<NumberClass> {

    private List<NumberClass> listItems;

    public CustomNumberArrayAdapter(Activity context, List<NumberClass> items){
        super(context,0,items);
        listItems = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;

        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.data_card_number,parent,false);
        }

        NumberClass currentItem = listItems.get(position);

        ImageView img = (ImageView) listView.findViewById(R.id.sound);
        img.setOnClickListener(new ImageClick(currentItem));

        TextView eng = (TextView) listView.findViewById(R.id.english);
        TextView mao = (TextView) listView.findViewById(R.id.maori);
        ImageView icon = (ImageView) listView.findViewById(R.id.imgnumber);

        img.setImageResource(currentItem.getNumbersoundimage());
        eng.setText(currentItem.getNumberenglish());
        mao.setText(currentItem.getNumbermaori());
        icon.setImageResource(currentItem.getNumberimage());

        return listView;
    }

    public class ImageClick implements View.OnClickListener{

        private NumberClass itemlist;

        public ImageClick(NumberClass item){
            itemlist = item;
        }

        @Override
        public void onClick(View view) {
            final MediaPlayer player = MediaPlayer.create(view.getContext(), itemlist.getSound());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    player.start();
                    player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            player.release();
                        }
                    });
                }
            }).start();
        }
    }
}
