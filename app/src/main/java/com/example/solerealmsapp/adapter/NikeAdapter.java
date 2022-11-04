package com.example.solerealmsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.solerealmsapp.MainActivity;
import com.example.solerealmsapp.R;
import com.example.solerealmsapp.model.Adidas;
import com.example.solerealmsapp.model.Jordan;
import com.example.solerealmsapp.model.Nike;

import java.util.List;

public class NikeAdapter extends RecyclerView.Adapter<NikeAdapter.NikeViewHolder> {

    Context context;
    List<Nike> nikeList;

    public NikeAdapter(Context context, List<Nike> nikeList){
        this.context = context;
        this.nikeList = nikeList;
    }

    @NonNull
    @Override
    public NikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.nike_row_item, parent, false);
        return new NikeAdapter.NikeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NikeViewHolder holder, int position) {
        holder.shoeImage.setImageResource(nikeList.get(position).getImageUrl());
        holder.name.setText(nikeList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return nikeList.size();
    }

    public static class NikeViewHolder extends RecyclerView.ViewHolder {

        ImageView shoeImage;
        TextView name;

        public NikeViewHolder(@NonNull View itemView) {
            super(itemView);

            shoeImage = itemView.findViewById(R.id.shoeImage3);
            name = itemView.findViewById(R.id.textView3);

        }
    }
}