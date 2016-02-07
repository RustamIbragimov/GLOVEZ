package com.rustam.glovez.fragments.profile;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rustam.glovez.R;
import com.rustam.glovez.model.FeedItemData;
import com.rustam.glovez.model.StatisticsAdapter;
import com.rustam.glovez.model.StatisticsItemData;

import java.util.ArrayList;
import java.util.List;


public class StatisticsFragment extends Fragment {

    private RecyclerView recyclerView;
    private StatisticsAdapter adapter;

    public StatisticsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_statistics, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.statistics_layout);
        adapter = new StatisticsAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    private static List<StatisticsItemData> getData() {
        List<StatisticsItemData> list = new ArrayList<>();
        String date = "19.01.16";
        int progress = 20;

        for (int i = 0; i < 100; i++) {
            StatisticsItemData item = new StatisticsItemData(date, progress);
            list.add(item);
        }


        return list;
    }

}
