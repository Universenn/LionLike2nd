package lionlike.java10m.week1.day1007.practice.fileinoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bufferreader {
    public static void main(String[] args) throws IOException {
        BufferedReader bfread = new BufferedReader(new FileReader("c:/out.txt"));
        while (true){
            String line = bfread.readLine();
            if(line == null)
                break;
            System.out.println(line);
        }
        bfread.close();
    }

}
