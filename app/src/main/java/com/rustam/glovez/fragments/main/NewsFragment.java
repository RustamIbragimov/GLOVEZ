package com.rustam.glovez.fragments.main;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.rustam.glovez.R;

import info.hoang8f.android.segmented.SegmentedGroup;


public class NewsFragment extends Fragment implements RadioGroup.OnCheckedChangeListener {

    private SegmentedGroup segmentedGroup;
    private FragmentTransaction ft;
    private AppCompatActivity activity;

    public NewsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_news, container, false);
        activity = (AppCompatActivity) getActivity();

        segmentedGroup = (SegmentedGroup) linearLayout.findViewById(R.id.segmented_news);
        segmentedGroup.setOnCheckedChangeListener(this);
        segmentedGroup.check(R.id.feed_radio_button);

        return linearLayout;
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.feed_radio_button:
                ft = activity.getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.news_container, new FeedFragment());
                ft.commit();
                break;

            case R.id.popular_radio_button:
                ft = activity.getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.news_container, new PopularFragment());
                ft.commit();
                break;

            case R.id.search_radio_button:
                ft = activity.getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.news_container, new SearchFragment());
                ft.commit();
                break;

            default:
        }
    }
}
