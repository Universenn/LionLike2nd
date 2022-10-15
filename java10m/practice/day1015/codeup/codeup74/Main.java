package lionlike.java10m.practice.day1015.codeup.codeup74;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        for (long i = num; i>0; i--) {
            System.out.println(i);
        }

        sc.close();

    }

}
