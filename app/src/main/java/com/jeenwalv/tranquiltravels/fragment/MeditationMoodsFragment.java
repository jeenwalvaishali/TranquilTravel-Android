package com.jeenwalv.tranquiltravels.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.jeenwalv.tranquiltravels.R;
import com.jeenwalv.tranquiltravels.adapter.MoodAdapter;
import com.jeenwalv.tranquiltravels.model.Mood;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;




public class MeditationMoodsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meditation_moods, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewMeditationMoods);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        List<Mood> meditationMoods = new ArrayList<>();
        meditationMoods.add(new Mood("Meditative Escapes", R.drawable.mood1));
        meditationMoods.add(new Mood("Silence and Solitude", R.drawable.mood1));
        meditationMoods.add(new Mood("Zen Retreat", R.drawable.mood1));
        meditationMoods.add(new Mood("Meditative Escapes", R.drawable.mood1));
        meditationMoods.add(new Mood("Silence and Solitude", R.drawable.mood1));
        meditationMoods.add(new Mood("Zen Retreat", R.drawable.mood1));


        recyclerView.setAdapter(new MoodAdapter(meditationMoods));
        return view;
    }
}

