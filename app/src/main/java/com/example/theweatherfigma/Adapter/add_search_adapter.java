package com.example.theweatherfigma.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.theweatherfigma.Domain.add_search_domain;
import com.example.theweatherfigma.R;

import java.util.List;

public class add_search_adapter extends RecyclerView.Adapter<add_search_adapter.viewHolder> {

    List<add_search_domain> items;
    Context context;

    public add_search_adapter(List<add_search_domain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public add_search_adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_add, parent, false);
        context = parent.getContext();
        return new viewHolder(inflate);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull add_search_adapter.viewHolder holder, int position) {
        holder.txt_nhietdo.setText(items.get(position).getTxt_nhietdo() + "°C");
        holder.txt_H.setText(items.get(position).getTxt_H() + "°C");
        holder.txt_L.setText(items.get(position).getTxt_L() + "°C");
        holder.txt_location.setText(items.get(position).getTxt_location());
        holder.txt_status.setText(items.get(position).getTxt_status());
        @SuppressLint("DiscouragedApi") int drawableResourceID = holder.itemView.getResources().getIdentifier(items.get(position).getImg_weather(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceID).into(holder.img_weather);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView txt_nhietdo, txt_H, txt_L, txt_location, txt_status;
        ImageView img_weather;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nhietdo = itemView.findViewById(R.id.txt_nhiet_do_add_ID);
            txt_H = itemView.findViewById(R.id.txt_H_add_ID);
            txt_L = itemView.findViewById(R.id.txt_L_add_ID);
            txt_location = itemView.findViewById(R.id.txt_location_add_ID);
            txt_status = itemView.findViewById(R.id.txt_status_add_ID);
            img_weather = itemView.findViewById(R.id.img_weather_add_ID);

        }
    }
}
