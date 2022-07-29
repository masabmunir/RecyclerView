package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.example.recyclerview.Models.RecipeModel;
import com.example.recyclerview.Packages.RecipeAdapter;
import com.example.recyclerview.classes.RecyclerItemClickListener;

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
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener
                (this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                     switch (position){
                         case 0:
                             Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                             startActivity(intent);
                             break;
                         case 1:
                             Toast.makeText(MainActivity.this, "Sandwich is selected", Toast.LENGTH_SHORT).show();
                             break;
                         case 2:
                             Toast.makeText(MainActivity.this, "Rice Plater is selected", Toast.LENGTH_SHORT).show();
                             break;
                         default:
                     }

                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));

//        For Horizontal Layout
//        LinearLayoutManager layoutManager = (new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
//         recyclerView.setLayoutManager(layoutManager);
    }
}