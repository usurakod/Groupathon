package com.example.umasurakod.groupathon;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {
    int[] images = {R.drawable.download1,R.drawable.download2,R.drawable.download3,R.drawable.download4,R.drawable.download5,R.drawable.download7,R.drawable.download8};
    String[] titles;
    String[] descriptions;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_general);

        Resources res = getResources();
        titles=res.getStringArray(R.array.titles);
        descriptions = res.getStringArray(R.array.description);
        list=findViewById(R.id.list_view);


        SushAdapter adapter = new SushAdapter(this,titles,descriptions,images);
        list.setAdapter(adapter);
    }
    class SushAdapter extends ArrayAdapter<String> {
        Context context;
        int[] images;
        String[] titleArray;
        String[] descriptionArray;
        SushAdapter(Context c, String[] titles,String[] descriptions, int[] imgs){
            super(c,R.layout.singlerow_listall,R.id.textView2,titles);
            this.context=c;
            this.titleArray = titles;
            this.descriptionArray = descriptions;
            this.images = imgs;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.singlerow_listall,parent,false);
            ImageView myImages =  row.findViewById(R.id.imageView);
            TextView title = row.findViewById(R.id.textView2);
            TextView desc = row.findViewById(R.id.textView3);
            title.setText(titleArray[position]);
            myImages.setImageResource(images[position]);

            desc.setText(descriptionArray[position]);
            return row;
        }
    }
}
