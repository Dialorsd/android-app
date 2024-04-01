package com.example.my_proj;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder{
    TextView name, position, salary;
    public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.name);
        position = itemView.findViewById(R.id.position);
        salary = itemView.findViewById(R.id.salary);
    }
}
