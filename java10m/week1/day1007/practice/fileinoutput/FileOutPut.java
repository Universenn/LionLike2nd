package lionlike.java10m.week1.day1007.practice.fileinoutput;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPut {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/out.txt");
        output.close();
    }
}
