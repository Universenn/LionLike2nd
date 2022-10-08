package lionlike.java10m.week1.day1007.jumptojava.q4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {1,3,5,7,9};
        Calculator cal = new Calculator();
        System.out.println(cal.avg(data));

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        System.out.println(cal.avg(arr)); // value 값을 같이 쓰고있어서 50 이 나오는건가
    }
}
