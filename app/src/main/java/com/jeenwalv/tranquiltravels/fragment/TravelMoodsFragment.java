package com.jeenwalv.tranquiltravels.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jeenwalv.tranquiltravels.R;
import com.jeenwalv.tranquiltravels.adapter.MoodAdapter;
import com.jeenwalv.tranquiltravels.model.Mood;

import java.util.ArrayList;
import java.util.List;

public class TravelMoodsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_travel_moods, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewTravelMoods);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        List<Mood> travelMoods = new ArrayList<>();
        travelMoods.add(new Mood("Mindful Meditation", R.drawable.mood1));
        travelMoods.add(new Mood("Yoga and Relaxation", R.drawable.mood1));
        travelMoods.add(new Mood("Spiritual Journey", R.drawable.mood1));
        travelMoods.add(new Mood("Spiritual Journey", R.drawable.mood1));
        travelMoods.add(new Mood("Spiritual Journey", R.drawable.mood1));
        travelMoods.add(new Mood("Spiritual Journey", R.drawable.mood1));

        recyclerView.setAdapter(new MoodAdapter(travelMoods));
        return view;
    }
}
