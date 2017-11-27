package com.example.nethanjan.projectuiux;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class CustomColorArrayAdapter extends ArrayAdapter<ColorClass> {

    private List<ColorClass> listItems;

    public CustomColorArrayAdapter(Activity context, List<ColorClass> items){
        super(context,0,items);
        listItems = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;

        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.data_card_color,parent,false);
        }

        ColorClass currentItem = listItems.get(position);

        ImageView img = (ImageView) listView.findViewById(R.id.sound);
        img.setOnClickListener(new ImageClick(currentItem));

        TextView eng = (TextView) listView.findViewById(R.id.english);
        TextView mao = (TextView) listView.findViewById(R.id.maori);
        LinearLayout layout = (LinearLayout) listView.findViewById(R.id.colorLayoutid);

        img.setImageResource(currentItem.getColorsoundimage());
        eng.setText(currentItem.getColorenglish());
        mao.setText(currentItem.getColormaori());
        layout.setBackgroundColor(currentItem.getColor());

        return listView;
    }

    public class ImageClick implements View.OnClickListener{

        private ColorClass itemlist;

        public ImageClick(ColorClass item){
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
