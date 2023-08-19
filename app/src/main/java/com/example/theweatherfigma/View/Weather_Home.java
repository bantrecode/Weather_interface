package com.example.theweatherfigma.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.theweatherfigma.Adapter.hourly_adapter;
import com.example.theweatherfigma.Domain.hourly_domain;
import com.example.theweatherfigma.R;

import java.util.ArrayList;

public class Weather_Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_home);

        ImageView img_list_home=findViewById(R.id.img_list_home_ID);
        img_list_home.setOnClickListener(view -> startActivity(new Intent(Weather_Home.this, Weather_Search_Add.class)));


        ArrayList<hourly_domain> items = new ArrayList<>();
        items.add(new hourly_domain("12 PM","moon_cloud_fast_wind","19"));
        items.add(new hourly_domain("13 PM","moon_cloud_mid_rain","20"));
        items.add(new hourly_domain("14 PM","sun_cloud_angled_rain","21"));
        items.add(new hourly_domain("15 PM","tornado","22"));
        items.add(new hourly_domain("16 PM","sun_cloud_angled_rain","23"));
        items.add(new hourly_domain("17 PM","sun_cloud_angled_rain","24"));
        items.add(new hourly_domain("18 PM","moon_cloud_mid_rain","25"));
        items.add(new hourly_domain("19 PM","tornado","26"));
        items.add(new hourly_domain("20 PM","moon_cloud_fast_wind","27"));
        items.add(new hourly_domain("21 PM","tornado","28"));
        RecyclerView recyclerView_Catelogy = findViewById(R.id.view_hourly_ID);
        recyclerView_Catelogy.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        RecyclerView.Adapter<hourly_adapter.viewHolder> adapter_catelogy = new hourly_adapter(items);
        recyclerView_Catelogy.setAdapter(adapter_catelogy);
    }
}