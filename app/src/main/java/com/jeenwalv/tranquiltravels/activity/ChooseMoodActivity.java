package com.jeenwalv.tranquiltravels.activity;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.jeenwalv.tranquiltravels.R;
import com.jeenwalv.tranquiltravels.adapter.MoodsPagerAdapter;

public class ChooseMoodActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private MoodsPagerAdapter moodsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mood);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        moodsPagerAdapter = new MoodsPagerAdapter(this);
        viewPager.setAdapter(moodsPagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Travel Moods");
                        break;
                    case 1:
                        tab.setText("Meditation Moods");
                        break;
                }
            }
        }).attach();

        findViewById(R.id.continueButton).setOnClickListener(v -> {
            // Handle continue button click
        });
    }
}
