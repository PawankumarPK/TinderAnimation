package com.example.hp.tinderanimations;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class CardAdapter extends ArrayAdapter<Integer> {


    public CardAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //ImageView imgView = (ImageView)convertView.findViewById(R.id.image_content);
        //imgView.setImageResource(getItem(position));





        return convertView;
    }
}
