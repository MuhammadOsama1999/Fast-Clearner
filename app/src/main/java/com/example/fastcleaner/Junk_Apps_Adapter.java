package com.example.fastcleaner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.fastcleaner.Classes.Apps;

import java.util.List;

/**
 * Created by intag pc on 2/25/2017.
 */

public class Junk_Apps_Adapter extends RecyclerView.Adapter<Junk_Apps_Adapter.MyViewHolder> {

    public List<Apps> apps;

    public Junk_Apps_Adapter(List<Apps> getapps) {
        apps = getapps;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.junk_recycler_apps, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Apps app = apps.get(position);
        holder.size.setText(app.getSize());
        holder.image.setImageDrawable(app.getImage());
    }

    @Override
    public int getItemCount() {
        return apps.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView size;
        ImageView image;

        public MyViewHolder(View view) {
            super(view);
            size = (TextView) view.findViewById(R.id.apptext);
            image = (ImageView) view.findViewById(R.id.appimage);

        }
    }



}
