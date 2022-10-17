package lionlike.java10m.practice.week1.day1008.fileinoutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWrite {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("c:/out2.txt");  // 생성도 포함
        for(int i=5; i<11; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();

    }
}
