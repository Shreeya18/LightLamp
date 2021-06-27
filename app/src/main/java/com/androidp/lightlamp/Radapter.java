package com.androidp.lightlamp;

import android.icu.text.CaseMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class Radapter extends RecyclerView.Adapter<Radapter.Rholder>{
             private String[] data;
             public Radapter(String[] data){
                 this.data = data;
             }
    @NonNull
    @Override
    public Rholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View view = inflator.inflate(R.layout.itemlayout,parent,false);
                 return new Rholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Rholder holder, int position) {
            String title = data [position];
            holder.userName.setText(title);
    }

    @Override
    public int getItemCount()
    {
        return data.length;
    }

    public class Rholder extends RecyclerView.ViewHolder{
                 ImageView img1;
                 TextView userName;
                 ImageView imag;
                 Button like_btn;
                 Button cmnt_btn;
                 Button share_btn;
        public Rholder(@NonNull View itemView) {
            super(itemView);
            img1 = (ImageView) itemView.findViewById(R.id.img1);
            userName = (TextView) itemView.findViewById(R.id.userName);
            imag = (ImageView) itemView.findViewById(R.id.imag);
            like_btn = (Button) itemView.findViewById(R.id.like_btn);
            cmnt_btn = (Button) itemView.findViewById(R.id.cmnt_btn);
            share_btn = (Button) itemView.findViewById(R.id.share_btn);



        }
    }
}
