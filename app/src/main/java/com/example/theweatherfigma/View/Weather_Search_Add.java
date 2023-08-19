package com.example.theweatherfigma.View;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.theweatherfigma.Adapter.add_search_adapter;
import com.example.theweatherfigma.Domain.add_search_domain;
import com.example.theweatherfigma.R;

import java.util.ArrayList;

public class Weather_Search_Add extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_search_add);
        ImageView img_back= findViewById(R.id.img_back_ID);
        img_back.setOnClickListener(view -> finish());

        ArrayList<add_search_domain> items = new ArrayList<>();
        items.add(new add_search_domain("19","24","18","Montreal, Canada","Mid Rain","moon_cloud_mid_rain"));
        items.add(new add_search_domain("20","21","19","Toronto, Canada","Fast Wind","moon_cloud_fast_wind"));
        items.add(new add_search_domain("13","16","18","Tokyo, Japan","Showers","sun_cloud_angled_rain"));
        items.add(new add_search_domain("23","26","13","Tennessee, United States","Tornado","tornado"));
        items.add(new add_search_domain("31","36","26","Singapo, Singapo","Mid Rain","moon_cloud_mid_rain"));
        items.add(new add_search_domain("23","26","16","Taipei, Taiwan","Mid Rain","moon_cloud_fast_wind"));
        RecyclerView recyclerView_Catelogy = findViewById(R.id.add_search_id);
        recyclerView_Catelogy.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        RecyclerView.Adapter<add_search_adapter.viewHolder> adapter_catelogy = new add_search_adapter(items);
        recyclerView_Catelogy.setAdapter(adapter_catelogy);
    }
}