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
import com.example.app.adapters.PopularHorAdapter;
import com.example.app.adapters.PopularVerAdapter;
import com.example.app.models.FeaturedHorModel;
import com.example.app.models.FeaturedVerModel;
import com.example.app.models.PopularHorModel;
import com.example.app.models.PopularVerModel;

import java.util.ArrayList;

public class PopularFragment extends Fragment {
    RecyclerView popular_hor_recyclerView,popular_ver_recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_popular, container, false);

        // Popular Hor RecyclerView

        popular_hor_recyclerView=(RecyclerView) view.findViewById(R.id.popular_hor_rec);

        ArrayList<PopularHorModel> list1=new ArrayList<>();
        list1.add(new PopularHorModel(R.drawable.jean,"Jean","Description 1"));
        list1.add(new PopularHorModel(R.drawable.green_dress,"Green Dress","Description 2"));
        list1.add(new PopularHorModel(R.drawable.cerelac,"Cerelac","Description 3"));

        PopularHorAdapter adapter1=new PopularHorAdapter(list1,getContext());
        popular_hor_recyclerView.setAdapter(adapter1);

        LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        popular_hor_recyclerView.setLayoutManager(linearLayoutManager1);

        // Popular Ver RecyclerView

        popular_ver_recyclerView=(RecyclerView) view.findViewById(R.id.popular_ver_rec);

        ArrayList<PopularVerModel> list2=new ArrayList<>();
        list2.add(new PopularVerModel(R.drawable.jean,"Jean","Description 1","5.0","10:00 - 7:00"));
        list2.add(new PopularVerModel(R.drawable.green_dress,"Green Dress","Description 2","5.0","10:00 - 7:00"));
        list2.add(new PopularVerModel(R.drawable.cerelac,"Cerelac","Description 3","5.0","10:00 - 7:00"));

        PopularVerAdapter adapter2=new PopularVerAdapter(list2,getContext());
        popular_ver_recyclerView.setAdapter(adapter2);

        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        popular_ver_recyclerView.setLayoutManager(linearLayoutManager2);

        return view;
    }
}