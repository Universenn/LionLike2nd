package lionlike.java10m.week1.day1007.practice.fileinoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:/out.txt");
        for(int i=10; i>0; i--) {
            String data = i+"남았다.\r\n";
            fw.write(data);
        }
        fw.close();
    }
}