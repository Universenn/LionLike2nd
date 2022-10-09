package lionlike.java10m.practice.day1008.fileinoutput;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPut {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/out.txt");
        output.close();
    }
}
