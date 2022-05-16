package com.example.app.tabsFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app.R;
import com.example.app.adapters.NewHorAdapter;
import com.example.app.adapters.NewVerAdapter;
import com.example.app.adapters.PopularHorAdapter;
import com.example.app.adapters.PopularVerAdapter;
import com.example.app.models.NewHorModel;
import com.example.app.models.NewVerModel;
import com.example.app.models.PopularHorModel;
import com.example.app.models.PopularVerModel;

import java.util.ArrayList;

public class NewFragment extends Fragment {
    RecyclerView new_hor_recyclerView,new_ver_recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_new, container, false);

        // New Hor RecyclerView

        new_hor_recyclerView=(RecyclerView) view.findViewById(R.id.new_hor_rec);

        ArrayList<NewHorModel> list1=new ArrayList<>();
        list1.add(new NewHorModel(R.drawable.puzzle,"Puzzle","Description 1"));
        list1.add(new NewHorModel(R.drawable.car,"Car","Description 2"));
        list1.add(new NewHorModel(R.drawable.bicycle,"Bicycle","Description 3"));

        NewHorAdapter adapter1=new NewHorAdapter(list1,getContext());
        new_hor_recyclerView.setAdapter(adapter1);

        LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        new_hor_recyclerView.setLayoutManager(linearLayoutManager1);

        // New Ver RecyclerView

        new_ver_recyclerView=(RecyclerView) view.findViewById(R.id.new_ver_rec);

        ArrayList<NewVerModel> list2=new ArrayList<>();
        list2.add(new NewVerModel(R.drawable.puzzle,"Puzzle","Description 1","5.0","10:00 - 7:00"));
        list2.add(new NewVerModel(R.drawable.car,"Car","Description 2","5.0","10:00 - 7:00"));
        list2.add(new NewVerModel(R.drawable.bicycle,"Bicycle","Description 3","5.0","10:00 - 7:00"));

        NewVerAdapter adapter2=new NewVerAdapter(list2,getContext());
        new_ver_recyclerView.setAdapter(adapter2);

        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        new_ver_recyclerView.setLayoutManager(linearLayoutManager2);

        return view;
    }
}