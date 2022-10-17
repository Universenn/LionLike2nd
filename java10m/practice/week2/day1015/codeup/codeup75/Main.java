package lionlike.java10m.practice.week2.day1015.codeup.codeup75;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        for (long i = num-1; i>=0; i--) {
            System.out.println(i);
        }

        sc.close();

    }

}
