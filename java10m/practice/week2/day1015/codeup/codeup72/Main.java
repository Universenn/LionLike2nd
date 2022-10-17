package lionlike.java10m.practice.week2.day1015.codeup.codeup72;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        for (int i=0; i<num; i++) {
            long a = sc.nextLong();
            System.out.println(a);
        }

        sc.close();

    }

}
