package com.example.scheduler;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class schedule {
    public void updateSchedule() throws IOException {
        String filepath = "/Users/kimminjoo/study/scheduler/src/main/java/com/example/scheduler/schdule.txt";
        Data data = new Data("여행", "2024-02-19", "오전 8시", "제주도", "민주");

        List<String> lines = Files.readAllLines(Path.of(filepath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
        for (String line : lines) {
            if(line.startsWith("제목: ")){
                bw.write("제목: " + data.getTitle());
            } else if (line.startsWith("날짜: ")) {
                bw.write("날짜: " + data.getDate());
            } else if (line.startsWith("시간: ")) {
                bw.write("시간: " + data.getTime());
            } else if (line.startsWith("장소: ")) {
                bw.write("장소: " + data.getPlace());
            } else if (line.startsWith("작성자: ")) {
                bw.write("작성자: " + data.getWorker());
            }
            bw.newLine();
        }
        bw.close();

    }
}
