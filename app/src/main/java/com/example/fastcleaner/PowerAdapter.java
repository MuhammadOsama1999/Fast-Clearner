package com.example.fastcleaner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.fastcleaner.Classes.power_item;

import java.util.List;

/**
 * Created by intag pc on 2/16/2017.
 */

public class PowerAdapter extends RecyclerView.Adapter<PowerAdapter.MyViewHolder> {

    public List<power_item> apps;

    public PowerAdapter(List<power_item> getapps)
    {
        apps=getapps;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.powe_itemlist, parent, false);
        return new MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        power_item app= apps.get(position);
        holder.size.setText(app.getText());
    }

    @Override
    public int getItemCount() {
        return apps.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView size;


        public MyViewHolder(View view) {
            super(view);
            size = (TextView) view.findViewById(R.id.items);
        }
    }
}
