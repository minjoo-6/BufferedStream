package com.example.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SchedulerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SchedulerApplication.class, args);
        schedule sc = new schedule();
        sc.updateSchedule();

    }
}
