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
import com.example.theweatherfigma.Domain.hourly_domain;
import com.example.theweatherfigma.R;

import java.util.List;

public class hourly_adapter extends RecyclerView.Adapter<hourly_adapter.viewHolder> {

    List<hourly_domain> items;
    Context context;

    public hourly_adapter(List<hourly_domain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public hourly_adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.hourly, parent, false);
        context = parent.getContext();
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull hourly_adapter.viewHolder holder, int position) {
        holder.hourTxt.setText(items.get(position).getTxt_gio_hourly());
        holder.tempTxt.setText(items.get(position).getTxt_nhietdo_hourly() + "°C");
        @SuppressLint("DiscouragedApi") int drawableResourceID = holder.itemView.getResources().getIdentifier(items.get(position).getImg_weather_hourly(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceID).into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView hourTxt, tempTxt;
        ImageView pic;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            hourTxt = itemView.findViewById(R.id.txt_gio_houly_ID);
            tempTxt = itemView.findViewById(R.id.txt_nhietdo_hourly_ID);
            pic = itemView.findViewById(R.id.img_weather_hourly_ID);
        }
    }
}
