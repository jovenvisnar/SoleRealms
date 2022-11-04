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

import java.util.List;

public class JordanAdapter extends RecyclerView.Adapter<JordanAdapter.JordanViewHolder> {

    Context context;
    List<Jordan> jordanList;

    public JordanAdapter(Context context, List<Jordan> jordanList){
        this.context = context;
        this.jordanList = jordanList;
    }

    @NonNull
    @Override
    public JordanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.jordan_row_item, parent,false);
        return new JordanAdapter.JordanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JordanViewHolder holder, int position) {
        holder.shoeImage.setImageResource(jordanList.get(position).getImageUrl());
        holder.name.setText(jordanList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return jordanList.size();
    }

    public static class JordanViewHolder extends RecyclerView.ViewHolder{

        ImageView shoeImage;
        TextView name;

        public JordanViewHolder(@NonNull View itemView) {
            super(itemView);

            shoeImage = itemView.findViewById(R.id.shoeImage2);
            name = itemView.findViewById(R.id.textView2);
        }
    }
}
