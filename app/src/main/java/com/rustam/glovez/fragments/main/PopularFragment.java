package com.rustam.glovez.fragments.main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rustam.glovez.R;
import com.rustam.glovez.model.FeedAdapter;
import com.rustam.glovez.model.FeedItemData;

import java.util.ArrayList;
import java.util.List;


public class PopularFragment extends Fragment {

    //TODO: make normal RECYCLERVIEW
    private RecyclerView recyclerView;
    private FeedAdapter adapter;

    public PopularFragment() {
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
        View view =  inflater.inflate(R.layout.fragment_popular, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.popular_layout);
        adapter = new FeedAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }


    private static List<FeedItemData> getData() {
        String[] logins = {"@arstankz", "@arstankz", "@arstankz", "@arstankz"};
        int[] avatars = {R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle};
        int[] photos = {R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image};

        List<FeedItemData> list = new ArrayList<>();
        int n = logins.length;
        for (int i = 0; i < n; i++) {
            FeedItemData data = new FeedItemData(logins[i], avatars[i], photos[i]);
            list.add(data);
        }

        return list;
    }

}
