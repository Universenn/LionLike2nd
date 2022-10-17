package lionlike.java10m.practice.week1.day1008.fileinoutput;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileReader fr = new FileReader("c:/out.txt");
        fr.read();
        System.out.println(new String(b));
        fr.close();
    }
}
