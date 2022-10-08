package lionlike.java10m.week1.day1007.practice.fileinoutput;

import java.io.FileNotFoundException;
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
