package lionlike.java10m.practice.week3.day1017.codeup.codeup90;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();

        for (int i = 0; i < num3-1; i++) {
            num1 = num1 * num2;
        }
        System.out.println(num1);
    }
}
