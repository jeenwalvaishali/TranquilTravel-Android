package com.jeenwalv.tranquiltravels.model;

public class Mood {
    private String title;
    private int imageResId;

    public Mood(String title, int imageResId) {
        this.title = title;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResId() {
        return imageResId;
    }
}
