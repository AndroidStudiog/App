package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.app.adapters.DetailedCategorizeByAgeAdapter;
import com.example.app.fragments.MyCartFragment;
import com.example.app.models.DetailedCategorizeByAgeModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class DetailedCategorizeByAgeActivity extends AppCompatActivity {
    RecyclerView detailed_dailyMeal_recyclerView;
    ImageView image;
    String type;
    FloatingActionButton carts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_categorize_by_age);

        carts=(FloatingActionButton) findViewById(R.id.carts);
        carts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DetailedCategorizeByAgeActivity.this, MyCartFragment.class);
            }
        });

        Intent intent=getIntent();
        type=intent.getStringExtra("type");

        detailed_dailyMeal_recyclerView=(RecyclerView) findViewById(R.id.detailed_rec);

        image=(ImageView) findViewById(R.id.detailed_img);

        ArrayList<DetailedCategorizeByAgeModel> list=new ArrayList<>();

        if (type!=null && type.equalsIgnoreCase("age1")){
            image.setImageResource(R.drawable.age1);
            list.add(new DetailedCategorizeByAgeModel(R.drawable.pac_age1,"Winter shirts shampoo and caps","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.pac_age2,"Baby oils","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.pac_age3,"Baby game","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.pac_age4,"Feed and feeding items","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.pac_age5,"8 toys in one pack","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
        }
        if (type!=null && type.equalsIgnoreCase("age2")){
            image.setImageResource(R.drawable.age2);
            list.add(new DetailedCategorizeByAgeModel(R.drawable.pack_age1,"Winter collection","Description","6.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.pack_age2,"All in one","Description","6.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.pack_age3,"Ten tiny toes","Description","6.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.pack_age4,"Baby gifts","Description","6.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.pack_age5,"Plastic toes","Description","6.0","10:00 - 7:00","120","ADD TO CART"));
        }
        if (type!=null && type.equalsIgnoreCase("age3")){
            image.setImageResource(R.drawable.age3);
            list.add(new DetailedCategorizeByAgeModel(R.drawable.packa_age1,"girls cloth pack","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.packa_age2,"Birthday wishing products","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.packa_age3,"Baby care kit","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.packa_age4,"Games for kids","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.packa_age5,"Caps and toes","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
        }
        if (type!=null && type.equalsIgnoreCase("age4")){
            image.setImageResource(R.drawable.age4);
            list.add(new DetailedCategorizeByAgeModel(R.drawable.packag_age1,"baby products symbols for newborn","Description","6.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.packag_age2,"1 dress and shoe","Description","6.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.packag_age3,"Baby care product and walker","Description","6.0","10:00 - 7:00","120","ADD TO CART"));
        }
        if (type!=null && type.equalsIgnoreCase("age5")){
            image.setImageResource(R.drawable.age5);
            list.add(new DetailedCategorizeByAgeModel(R.drawable.package_age1,"Gift packs","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.package_age2,"Shoes","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
            list.add(new DetailedCategorizeByAgeModel(R.drawable.package_age3,"Boy pent shirt with shoe","Description","5.0","10:00 - 7:00","120","ADD TO CART"));
        }

        DetailedCategorizeByAgeAdapter adapter=new DetailedCategorizeByAgeAdapter(list,this);
        detailed_dailyMeal_recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        detailed_dailyMeal_recyclerView.setLayoutManager(linearLayoutManager);
    }
}