package com.example.solerealmsapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.solerealmsapp.DetailActivity;
import com.example.solerealmsapp.R;
import com.example.solerealmsapp.model.Adidas;

import java.util.List;


public class AdidasAdapter extends RecyclerView.Adapter<AdidasAdapter.AdidasViewHolder> {

    Context context;
    List<Adidas> adidasList;

    public AdidasAdapter(Context context, List<Adidas> adidasList) {
        this.context = context;
        this.adidasList = adidasList;
    }

    @NonNull
    @Override
    public AdidasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.adidas_row_item, parent,false);
        return new AdidasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdidasViewHolder holder, int position) {

        holder.shoeImage.setImageResource(adidasList.get(position).getImageUrl());
        holder.name.setText(adidasList.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailActivity.class);
                context.startActivity(i);
            }
        });

    }


    @Override
    public int getItemCount() {
        return adidasList.size();
    }

    public final class AdidasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView shoeImage;
        TextView name;

        public AdidasViewHolder(@NonNull View itemView) {
            super(itemView);

            shoeImage = itemView.findViewById(R.id.shoeImage1);
            name = itemView.findViewById(R.id.textView1);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailActivity.class);
            context.startActivity(intent);

        }
    }
}
