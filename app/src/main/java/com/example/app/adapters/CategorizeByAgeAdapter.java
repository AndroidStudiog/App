package com.example.app.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.DetailedCategorizeByAgeActivity;
import com.example.app.R;
import com.example.app.models.CategorizeByAgeModel;

import java.util.ArrayList;

public class CategorizeByAgeAdapter extends RecyclerView.Adapter<CategorizeByAgeAdapter.ViewHolder> {
    ArrayList<CategorizeByAgeModel> list;
    Context context;

    public CategorizeByAgeAdapter(ArrayList<CategorizeByAgeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CategorizeByAgeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.categorize_by_age_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategorizeByAgeAdapter.ViewHolder holder, int position) {
        CategorizeByAgeModel mdl=list.get(position);
        holder.image.setImageResource(mdl.getImage());
        holder.name.setText(mdl.getName());
        holder.description.setText(mdl.getDescription());
        holder.discount.setText(mdl.getDiscount());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailedCategorizeByAgeActivity.class);
                intent.putExtra("type",mdl.getType());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name,description,discount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=(ImageView) itemView.findViewById(R.id.meal_img);
            name=(TextView) itemView.findViewById(R.id.meal_product_name);
            description=(TextView) itemView.findViewById(R.id.meal_description);
            discount=(TextView) itemView.findViewById(R.id.meal_discount);
        }
    }
}