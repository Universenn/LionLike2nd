package lionlike.java10m.week1.day1007.practice.fileinoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddFileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fwr = new FileWriter("c:/out2.txt",true); // 컴마 true 파일 추가
        fwr.write("추가할 내용");
        fwr.close();

        PrintWriter pwr = new PrintWriter(new FileWriter("c:/out2.txt",true));
        pwr.println("PrintWrite bbbbbbbb\r\n");
        pwr.close();
    }
}
