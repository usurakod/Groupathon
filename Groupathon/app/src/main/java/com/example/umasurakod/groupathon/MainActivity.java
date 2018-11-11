package com.example.umasurakod.groupathon;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout myDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private ImageView music;
    private ImageView hacking;
    private ImageView hiking;
    private ImageView sports;
    private ImageView photography;
    private ImageView other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setdisplayCategories();

        setdisplayEvents();
        myDrawerLayout =(DrawerLayout)findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this,myDrawerLayout,R.string.open,R.string.close);
        myDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        music =(ImageView) findViewById(R.id.music_img);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        hacking = (ImageView) findViewById(R.id.hacking_img);
        hacking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        hiking = (ImageView) findViewById(R.id.hiking_img);
        hiking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sports = (ImageView) findViewById(R.id.sports_img);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        photography = (ImageView) findViewById(R.id.photography_img);
        photography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        other = (ImageView) findViewById(R.id.other_img);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOncreateGrp();

            }
        });


    }

    public void openOncreateGrp(){
        Intent intent = new Intent(this, create_group.class);
        startActivity(intent);
    }
    // to select item from action bar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*public void setdisplayCategories() {
        ArrayList<Integer> myImageList = new ArrayList<>();
        myImageList.add(R.drawable.music);
        myImageList.add(R.drawable.hacking);
        myImageList.add(R.drawable.hiking);
        myImageList.add(R.drawable.sports);
        myImageList.add(R.drawable.photography);
        myImageList.add(R.drawable.joingrp);
        String[] names = {"Music", "Technology", "Adventure", "Sports", "Photography", "Others"};

        LinearLayout categories = findViewById(R.id.categories);
        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i <= 5; i++) {
            View view = inflater.inflate(R.layout.item_categories, categories, false);
            TextView name = view.findViewById(R.id.category_name);
            name.setText(names[i]);
            ImageView image = view.findViewById(R.id.image);
            image.setImageResource(myImageList.get(i));
            categories.addView(view);
        }
    }*/

        public void setdisplayEvents() {

        }

}
