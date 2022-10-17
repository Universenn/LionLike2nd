package lionlike.java10m.practice.week1.day1008.fileinoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/out.txt");
        for (int i =1; i<11; i++) {
            String fwrite = i+"번째 줄입니다. \r\n";  // String -> byte 배열로 바꿔줘야한다
            output.write(fwrite.getBytes());  // getBytes();
        }
        output.close();
    }
}
