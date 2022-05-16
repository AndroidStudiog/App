package com.example.app.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.R;
import com.example.app.models.HomeHorModel;
import com.example.app.models.HomeVerModel;

import java.util.ArrayList;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {
    ArrayList<HomeHorModel> list;
    Activity activity;
    UpdateVerticalRec updateVerticalRec;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(ArrayList<HomeHorModel> list, Activity activity, UpdateVerticalRec updateVerticalRec) {
        this.list = list;
        this.activity = activity;
        this.updateVerticalRec = updateVerticalRec;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_items, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HomeHorModel mdl = list.get(position);
        holder.image.setImageResource(mdl.getImage());
        holder.text.setText(mdl.getName());

        if (check) {
            ArrayList<HomeVerModel> list = new ArrayList<>();

            list.add(new HomeVerModel(R.drawable.jean, "Jeans", "10:00 - 23:00", "5.0", "700"));
            list.add(new HomeVerModel(R.drawable.jeans, "Stylish Jeans", "10:00 - 23:00", "5.0", "650"));
            list.add(new HomeVerModel(R.drawable.shirt, "Shirt", "10:00 - 23:00", "5.0", "600"));
            list.add(new HomeVerModel(R.drawable.shirts, "Shirt", "10:00 - 23:00", "5.0", "600"));
            list.add(new HomeVerModel(R.drawable.jacket, "jacket", "10:00 - 23:00", "5.0", "1500"));

            updateVerticalRec.callBack(list, position);
            check = false;
        }

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();

                if (position == 0) {
                    ArrayList<HomeVerModel> list = new ArrayList<>();

                    list.add(new HomeVerModel(R.drawable.jean, "Jeans", "10:00 - 23:00", "5.0", "700"));
                    list.add(new HomeVerModel(R.drawable.jeans, "Stylish Jeans", "10:00 - 23:00", "5.0", "650"));
                    list.add(new HomeVerModel(R.drawable.shirt, "Shirt", "10:00 - 23:00", "5.0", "600"));
                    list.add(new HomeVerModel(R.drawable.shirts, "Shirt", "10:00 - 23:00", "5.0", "600"));
                    list.add(new HomeVerModel(R.drawable.jacket, "jacket", "10:00 - 23:00", "5.0", "1500"));

                    updateVerticalRec.callBack(list, position);
                }
                if (position == 1) {
                    ArrayList<HomeVerModel> list = new ArrayList<>();

                    list.add(new HomeVerModel(R.drawable.wintercoat, "Winter Coat", "10:00 - 23:00", "5.0", "1500"));
                    list.add(new HomeVerModel(R.drawable.summedress, "Girl Summer Dress", "10:00 - 23:00", "5.0", "900"));
                    list.add(new HomeVerModel(R.drawable.green_dress, "Green Dress", "10:00 - 23:00", "5.0", "950"));
                    list.add(new HomeVerModel(R.drawable.girldress, "Girls Dress", "10:00 - 23:00", "5.0", "1000"));
                    list.add(new HomeVerModel(R.drawable.girls_jacket, "Girl Jacket", "10:00 - 23:00", "5.0", "1400" +
                            ""));
                    updateVerticalRec.callBack(list, position);
                }
                if (position == 2) {
                    ArrayList<HomeVerModel> list = new ArrayList<>();

                    list.add(new HomeVerModel(R.drawable.pediasure, "Pediasure", "10:00 - 23:00", "5.0", "1800"));
                    list.add(new HomeVerModel(R.drawable.lactogen1, "Lactogen", "10:00 - 23:00", "5.0", "350"));
                    list.add(new HomeVerModel(R.drawable.nanpro, "Nanpro", "10:00 - 23:00", "5.0", "900"));
                    list.add(new HomeVerModel(R.drawable.similac, "Similac", "10:00 - 23:00", "5.0", "1500"));
                    list.add(new HomeVerModel(R.drawable.cerelac, "Cerelac", "10:00 - 23:00", "5.0", "800"));
                    updateVerticalRec.callBack(list, position);
                }
                if (position == 3) {
                    ArrayList<HomeVerModel> list = new ArrayList<>();

                    list.add(new HomeVerModel(R.drawable.puzzle, "Puzzle", "10:00 - 23:00", "5.0", "250"));
                    list.add(new HomeVerModel(R.drawable.car, "Car", "10:00 - 23:00", "5.0", "9000"));
                    list.add(new HomeVerModel(R.drawable.bicycle, "Bicycle", "10:00 - 23:00", "5.0", "3000"));
                    list.add(new HomeVerModel(R.drawable.batball, "BatBall", "10:00 - 23:00", "5.0", "500"));
                    list.add(new HomeVerModel(R.drawable.wolf, "Wolf Toy", "10:00 - 23:00", "5.0", "100"));
                    updateVerticalRec.callBack(list, position);
                }
                if (position == 4) {
                    ArrayList<HomeVerModel> list = new ArrayList<>();

                    list.add(new HomeVerModel(R.drawable.momypoko, "Momypoko", "10:00 - 23:00", "5.0", "800"));
                    list.add(new HomeVerModel(R.drawable.huggies, "Huggies", "10:00 - 23:00", "5.0", "1000"));
                    list.add(new HomeVerModel(R.drawable.kids_life, "Kids Life", "10:00 - 23:00", "5.0", "950"));
                    list.add(new HomeVerModel(R.drawable.pampers, "Pampers", "10:00 - 23:00", "5.0", "850"));
                    list.add(new HomeVerModel(R.drawable.canbebe, "Canbebe", "10:00 - 23:00", "5.0", "900"));
                    updateVerticalRec.callBack(list, position);
                }
                if (position == 5) {
                    ArrayList<HomeVerModel> list = new ArrayList<>();

                    list.add(new HomeVerModel(R.drawable.package1, "Cloth Package", "10:00 - 23:00", "5.0", "900"));
                    list.add(new HomeVerModel(R.drawable.package2, "21 piece of toys", "10:00 - 23:00", "5.0", "1000"));
                    list.add(new HomeVerModel(R.drawable.package3, "Beauty products", "10:00 - 23:00", "5.0", "950"));
                    list.add(new HomeVerModel(R.drawable.package4, "Cycle and Walker", "10:00 - 23:00", "5.0", "850"));
                    list.add(new HomeVerModel(R.drawable.package5, "Bags and Caps", "10:00 - 23:00", "5.0", "800"));
                    updateVerticalRec.callBack(list, position);
                }
            }
        });

        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
                select = false;
            }
        } else {
            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            } else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg);
            }
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void searchBox(ArrayList<HomeHorModel> list3){
        list=list3;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView text;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=(ImageView) itemView.findViewById(R.id.hor_img);
            text=(TextView) itemView.findViewById(R.id.hor_text);
            cardView=(CardView) itemView.findViewById(R.id.hor_cardView);
        }
    }
}