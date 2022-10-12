package lionlike.java10m.practice.day1012.hospital.domain;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new Hospitalparser());
        String filename = "C:\\Users\\UserK\\Desktop\\백엔드 스쿨\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitalList = hospitalLineReader.readLines(filename);

        System.out.println(hospitalList.size());
        for (Hospital hospital : hospitalList) {
            System.out.println(hospital.getId());

        }
    }
}
