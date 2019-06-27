package com.example.recycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>
{

    String pname[];
    Context context;
    Integer avatar[];

    public CustomAdapter(Context context,String[] pname,Integer avatar[]){
        this.pname=pname;
        this.avatar=avatar;
        this.context=context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View v= layoutInflater.inflate(R.layout.activity_recycler,viewGroup,false);
        return (new MyViewHolder(v));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.iv.setImageResource(avatar[0]);
        myViewHolder.tv.setText(pname[i]);
    }


    @Override
    public int getItemCount() {

        return pname.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.user_name);
            iv=itemView.findViewById(R.id.avatar_icon);
        }
    }
}
