package com.rustam.glovez.fragments.profile;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.rustam.glovez.R;
import com.rustam.glovez.fragments.main.NewsFragment;
import com.rustam.glovez.model.Utility;


public class ProfileFragment extends Fragment {

    private ImageButton statisticsButton;
    private ImageButton achievementButton;
    private ImageButton humanButton;
    private ImageButton foodButton;
    private ImageButton settingsButton;

    private byte mode;

    private FragmentTransaction ft;

    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_profile, container, false);

        statisticsButton = (ImageButton) linearLayout.findViewById(R.id.profile_statistics_button);
        achievementButton = (ImageButton) linearLayout.findViewById(R.id.profile_achievements_button);
        humanButton = (ImageButton) linearLayout.findViewById(R.id.profile_human_button);
        foodButton = (ImageButton) linearLayout.findViewById(R.id.profile_food_button);
        settingsButton = (ImageButton) linearLayout.findViewById(R.id.profile_settings_button);

        mode = Utility.PROFILE_HUMAN;
        // TODO: change image when clicked

        ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.profile_placeholder, new HumanFragment());
        ft.commit();

        statisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showStatistics();
            }
        });

        achievementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAchievements();
            }
        });

        humanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showHuman();
            }
        });

        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFood();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSettings();
            }
        });

        return linearLayout;
    }

    private void showStatistics() {
        mode = Utility.PROFILE_STATISTICS;
        ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.profile_placeholder, new StatisticsFragment());
        ft.commit();
    }

    private void showAchievements() {
        mode = Utility.PROFILE_ACHIEVEMENTS;
        ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.profile_placeholder, new AchievementsFragment());
        ft.commit();
    }

    private void showHuman() {
        mode = Utility.PROFILE_HUMAN;
        ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.profile_placeholder, new HumanFragment());
        ft.commit();
    }

    private void showFood() {
        mode = Utility.PROFILE_FOOD;
        ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.profile_placeholder, new FoodFragment());
        ft.commit();
    }

    private void showSettings() {
        mode = Utility.PROFILE_SETTINGS;
        ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.profile_placeholder, new SettingsFragment());
        ft.commit();
    }

}
