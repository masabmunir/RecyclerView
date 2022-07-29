package com.example.recyclerview.Packages;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Models.RecipeModel;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder> {

    ArrayList<RecipeModel> list;
    Context context;

    public RecipeAdapter(ArrayList<RecipeModel> list,Context context) {
        this.list = list;
        this.context=context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview,parent,false);
        return new viewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
     RecipeModel model = list.get(position);

     holder.imageview.setImageResource(model.getPic());
     holder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageview;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

        }
    }
}
