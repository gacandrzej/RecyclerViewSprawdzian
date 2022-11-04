package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
LinearLayoutManager linearLayoutManager;

String [] dogs;
Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int [] dogsPictures ={
          R.drawable.australian_silky_terrier,
          R.drawable.cairn_terrier,
          R.drawable.cesky_terrier,
          R.drawable.chihuahua_long_coat,
          R.drawable.golden_retriever,
                R.drawable.malamut,
                R.drawable.pudel_duzy,
                R.drawable.cavalier_king_charles_spaniel,
                R.drawable.labrador_retriever
        };
        resources = getResources();
        dogs = resources.getStringArray(R.array.dogs);

        linearLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);

        ItemAdapterImage itemAdapterImage = new ItemAdapterImage(dogs,dogsPictures,this);
        recyclerView.setAdapter(itemAdapterImage);
    }
}