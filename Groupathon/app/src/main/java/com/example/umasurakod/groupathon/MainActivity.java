package com.example.umasurakod.groupathon;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setdisplayCategories();

        setdisplayEvents();
        myDrawerLayout =(DrawerLayout)findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this,myDrawerLayout,R.string.open,R.string.close);

        myDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    // to select item from action bar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setdisplayCategories() {
        ArrayList<Integer> myImageList = new ArrayList<>();
        myImageList.add(R.drawable.music);
        myImageList.add(R.drawable.hacking);
        myImageList.add(R.drawable.hiking);
        myImageList.add(R.drawable.sports);
        myImageList.add(R.drawable.photography);
        myImageList.add(R.mipmap.ic_launcher);
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
    }

        public void setdisplayEvents() {

        }
}
