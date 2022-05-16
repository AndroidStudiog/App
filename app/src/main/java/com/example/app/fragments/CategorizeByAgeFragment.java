package com.example.app.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app.R;
import com.example.app.adapters.CategorizeByAgeAdapter;
import com.example.app.models.CategorizeByAgeModel;

import java.util.ArrayList;

public class CategorizeByAgeFragment extends Fragment {
    RecyclerView dailyMeal_recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_categorize_by_age, container, false);

        dailyMeal_recyclerView=(RecyclerView) view.findViewById(R.id.daily_meal_recyclerview);

        ArrayList<CategorizeByAgeModel> list=new ArrayList<>();
        list.add(new CategorizeByAgeModel(R.drawable.age1,"1 Year Age","Get best for your kids 1 Year Age","30% OFF","age1"));
        list.add(new CategorizeByAgeModel(R.drawable.age2,"2 Year Age","Get best for your kids 2 Year Age","25% OFF","age2"));
        list.add(new CategorizeByAgeModel(R.drawable.age3,"3 Year Age","Get best for your kids 3 Year Age","20% OFF","age3"));
        list.add(new CategorizeByAgeModel(R.drawable.age4,"4 Year Age","Get best for your kids 4 Year Age","15% OFF","age4"));
        list.add(new CategorizeByAgeModel(R.drawable.age5,"5 Year Age","Get best for your kids 5 Year Age","10% OFF","age5"));

        CategorizeByAgeAdapter adapter=new CategorizeByAgeAdapter(list,getContext());
        dailyMeal_recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        dailyMeal_recyclerView.setLayoutManager(linearLayoutManager);

        return view;
    }
}