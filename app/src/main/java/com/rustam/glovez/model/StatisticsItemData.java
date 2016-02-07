package com.rustam.glovez.model;

/**
 * Created by Rustam on 2/7/2016.
 */
public class StatisticsItemData {

    private String date;
    private int progress;


    public StatisticsItemData(String date, int progress) {
        this.date = date;
        this.progress = progress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProgress() {
        if (progress >= 0) return "+ " + String.valueOf(progress);
        else return "- " + String.valueOf(-progress);
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
