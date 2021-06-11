package com.androidp.lightlamp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class feedPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_page3);

           RecyclerView review = findViewById(R.id.review);
           review.setLayoutManager(new LinearLayoutManager(this));

           String[] languages = {"Java","Python", "PHP","C++","C","HTML","CSS"};
           review.setAdapter(new Radapter(languages));



    }
}



