package com.example.girish.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<String> integer_data= new ArrayList<>();
    //Creating a Adapter ref variable
     recyclerViewAdapter data_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        integer_data.add("55");
        integer_data.add("65");
        integer_data.add("88");
        integer_data.add("74");
//passing data to a constructor
        data_view= new recyclerViewAdapter(this,integer_data);

        RecyclerView waitlistRecyclerView;

        // Set local attributes to corresponding views
        waitlistRecyclerView = (RecyclerView) findViewById(R.id.recycler_id);

        // Set layout for the RecyclerView, because it's a list we are using the linear layout
        waitlistRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Link the adapter to the RecyclerView
        waitlistRecyclerView.setAdapter(data_view);



    }
}
