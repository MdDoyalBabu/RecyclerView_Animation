package com.example.recyclerviewanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewanimation.adapter.NewsItemAdapter;
import com.example.recyclerviewanimation.model.NewsItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    private RecyclerView recyclerView;
    private List<NewsItem> newsItems;
    private NewsItemAdapter newsItemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.recyclerView_id);


        addUsername();

        newsItemAdapter=new NewsItemAdapter(this,newsItems);
        recyclerView.setAdapter(newsItemAdapter);


    }
    private void addUsername() {
        int i;
        newsItems=new ArrayList<>();

        for (i=0;i<15;i++){
            newsItems.add(new NewsItem("Doyal babu ".concat(String.valueOf(i)),"Rangpur Polytechnic Institute "));
        }


    }
}