package com.rustam.glovez;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.rustam.glovez.fragments.main.NewsFragment;
import com.rustam.glovez.fragments.profile.ProfileFragment;
import com.rustam.glovez.model.Utility;

public class MainActivity extends AppCompatActivity {

    private FragmentTransaction ft;
    private byte mode;

    private ImageButton homeButton;
    private ImageButton goButton;
    private ImageButton profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_placeholder, new NewsFragment());
        ft.commit();

        mode = Utility.MAIN_HOME;

        homeButton = (ImageButton) findViewById(R.id.home_button);
        goButton = (ImageButton) findViewById(R.id.go_button);
        profileButton = (ImageButton) findViewById(R.id.profile_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mode == Utility.MAIN_HOME) {
                    // TODO: refresh news
                }
                else {
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.main_placeholder, new NewsFragment());
                    ft.commit();

                    mode = Utility.MAIN_HOME;
                }
            }
        });

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mode == Utility.MAIN_PROFILE) {
                    // TODO: refresh date
                }
                else {
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.main_placeholder, new ProfileFragment());
                    ft.commit();
                    mode = Utility.MAIN_PROFILE;
                }
            }
        });

    }

}
