package com.jeenwalv.tranquiltravels.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jeenwalv.tranquiltravels.R;
import com.jeenwalv.tranquiltravels.model.Mood;

import java.util.List;

public class MoodAdapter extends RecyclerView.Adapter<MoodAdapter.MoodViewHolder> {
    private List<Mood> moodList;


    public MoodAdapter(List<Mood> moodList) {
        this.moodList = moodList;
    }

    @NonNull
    @Override
    public MoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mood_card, parent, false);
        return new MoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoodViewHolder holder, int position) {
        Mood mood = moodList.get(position);
        holder.moodTitle.setText(mood.getTitle());
        holder.moodImage.setImageResource(mood.getImageResId());
    }

    @Override
    public int getItemCount() {
        return moodList.size();
    }

    static class MoodViewHolder extends RecyclerView.ViewHolder {
        TextView moodTitle;
        ImageView moodImage;

        MoodViewHolder(View itemView) {
            super(itemView);
            moodTitle = itemView.findViewById(R.id.moodTitle);
            moodImage = itemView.findViewById(R.id.moodImage);
        }
    }
}
