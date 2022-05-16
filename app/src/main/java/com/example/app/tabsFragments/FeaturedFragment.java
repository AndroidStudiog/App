package com.example.app.tabsFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app.R;
import com.example.app.adapters.FeaturedHorAdapter;
import com.example.app.adapters.FeaturedVerAdapter;
import com.example.app.models.FeaturedHorModel;
import com.example.app.models.FeaturedVerModel;

import java.util.ArrayList;

public class FeaturedFragment extends Fragment {
    RecyclerView featured_hor_recyclerView,featured_ver_recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_featured, container, false);

        // Featured Hor RecyclerView

        featured_hor_recyclerView=(RecyclerView) view.findViewById(R.id.featured_hor_rec);

        ArrayList<FeaturedHorModel> list1=new ArrayList<>();
        list1.add(new FeaturedHorModel(R.drawable.pac_age1,"Winter shirts shampoo and caps","Description 1"));
        list1.add(new FeaturedHorModel(R.drawable.pac_age3,"Baby game","Description 2"));
        list1.add(new FeaturedHorModel(R.drawable.pac_age5,"8 toys in one pack","Description 3"));

        FeaturedHorAdapter adapter1=new FeaturedHorAdapter(list1,getContext());
        featured_hor_recyclerView.setAdapter(adapter1);

        LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        featured_hor_recyclerView.setLayoutManager(linearLayoutManager1);

        // Featured Ver RecyclerView

        featured_ver_recyclerView=(RecyclerView) view.findViewById(R.id.featured_ver_rec);

        ArrayList<FeaturedVerModel> list2=new ArrayList<>();
        list2.add(new FeaturedVerModel(R.drawable.pac_age1,"Winter shirts shampoo and caps","Description 1","5.0","10:00 - 7:00"));
        list2.add(new FeaturedVerModel(R.drawable.pac_age3,"Baby game","Description 2","5.0","10:00 - 7:00"));
        list2.add(new FeaturedVerModel(R.drawable.pac_age5,"8 toys in one pack","Description 3","5.0","10:00 - 7:00"));

        FeaturedVerAdapter adapter2=new FeaturedVerAdapter(list2,getContext());
        featured_ver_recyclerView.setAdapter(adapter2);

        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        featured_ver_recyclerView.setLayoutManager(linearLayoutManager2);

        return view;
    }
}