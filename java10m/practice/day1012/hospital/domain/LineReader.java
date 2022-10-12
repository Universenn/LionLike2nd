package lionlike.java10m.practice.day1012.hospital.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class LineReader {
    List<String> readLines(String filename) throws IOException {

        List<String> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        while ((str =br.readLine()) != null){
            result.add(str);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\UserK\\Desktop\\백엔드 스쿨\\서울시 병의원 위치 정보.csv";
        LineReader lr = new LineReader();
        List<String> lines = lr.readLines(filename);
        System.out.println(lines.size());
    }
}
