package com.jeenwalv.tranquiltravels.adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.jeenwalv.tranquiltravels.fragment.MeditationMoodsFragment;
import com.jeenwalv.tranquiltravels.fragment.TravelMoodsFragment;

public class MoodsPagerAdapter extends FragmentStateAdapter {

    public MoodsPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new TravelMoodsFragment();
            case 1:
                return new MeditationMoodsFragment();
            default:
                return new TravelMoodsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
