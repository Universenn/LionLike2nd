package lionlike.java10m.practice.week2.day1013.codeup.codeup64;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (a>b&&b>c||a<b&&b>c) {
            System.out.println(c);

        }
        else if (a>b){
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
        sc.close();
    }

}
