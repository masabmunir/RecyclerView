package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Models.RecipeModel;
import com.example.recyclerview.Packages.RecipeAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        ArrayList <RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.burgerddeal,"burger"));
        list.add(new RecipeModel(R.drawable.burgerddeal,"Sandwich"));
        list.add(new RecipeModel(R.drawable.rice,"Rice Plater"));
        list.add(new RecipeModel(R.drawable.sandwich,"Mix Sandwich"));

        RecipeAdapter adapter = new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);

//        For Verical Layout
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

//        For Horizontal Layout
        LinearLayoutManager layoutManager = (new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
         recyclerView.setLayoutManager(layoutManager);
    }
}