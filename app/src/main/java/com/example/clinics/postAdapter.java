package com.example.clinics;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class postAdapter extends RecyclerView.Adapter<postAdapter.ViewHolder> {
    private ArrayList<postclass> pArrayList;
    private OnItemClickListener Plistener;
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public void SetOnItemClickListener(OnItemClickListener plistener){ Plistener=plistener; }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView pTextView;
     //   public TextView deac;


        public ViewHolder(@NonNull View itemView, final OnItemClickListener plistener) {
            super(itemView);
            pTextView = itemView.findViewById(R.id.pText);
           // deac = itemView.findViewById(R.id.deac);
            img = itemView.findViewById(R.id.img);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (plistener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            plistener.onItemClick(position);
                        }
                    }
                }
            });
        }

    }
    public postAdapter (ArrayList<postclass>List){
        pArrayList=List;
    }






    @Override
    public postAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.itempost,parent,false);
        postAdapter.ViewHolder ViewHolder=new ViewHolder(v,Plistener);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder( postAdapter.ViewHolder holder, int position) {
        postclass Item= pArrayList.get(position);
        //pass values
        holder.img.setImageResource(Item.getImg());
        holder.pTextView.setText(Item.getpTextV1());
      //  holder.deac.setText(Item.getDeac());

    }

    @Override
    public int getItemCount() {
        return pArrayList.size();
    }
}
