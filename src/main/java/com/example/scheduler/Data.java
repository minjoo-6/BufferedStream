package com.example.scheduler;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Data {
    private String title;
    private String date;
    private String time;
    private String place;
    private String worker;

    public Data(String title, String date, String time, String place, String worker) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.place = place;
        this.worker = worker;
    }
}
