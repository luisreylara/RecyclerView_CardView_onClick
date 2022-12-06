package com.example.micardview_e02_cardview;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.myViewHolder> {
    private ArrayList<MyModel> models;
    private OnFrutaListener mOnFrutaListener;
    public MyAdapter(ArrayList<MyModel> models, OnFrutaListener onFrutaListener) {
        this.models=models;
        this.mOnFrutaListener=onFrutaListener;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_single_item_row,
                parent,false);
        Log.e("rey","onCreateViewHolder");
        return new myViewHolder(view,mOnFrutaListener);

    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.imageView.setImageResource(models.get(position).getImageRes());
        holder.Name.setText(models.get(position).getName());
        holder.Precio.setText(models.get(position).getPrice());
        Log.e("rey","onBindViewHolder NAME: "+models.get(position).getName());
    }

    @Override
    public int getItemCount() {return models.size();}

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        ImageView imageView;
        TextView Name, Precio,tvMensaje;
        OnFrutaListener onFrutaListener;
        public myViewHolder(@NonNull View itemView, OnFrutaListener onFrutaListener) {
            super(itemView);
            imageView= itemView.findViewById(R.id.imageView);
            Name = itemView.findViewById(R.id.tvName);
            Precio = itemView.findViewById(R.id.tvPrice);
            tvMensaje = itemView.findViewById(R.id.tvMensaje);
            this.onFrutaListener=onFrutaListener;
            itemView.setOnClickListener(this);
            Log.e("rey","myViewHolder Name:");

        }

        @Override
        public void onClick(View view) {
            onFrutaListener.onFrutaClick(getAdapterPosition());
        }
    }
    public interface OnFrutaListener{
        void onFrutaClick(int position);
    }


}
