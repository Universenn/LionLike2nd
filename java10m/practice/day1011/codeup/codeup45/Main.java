package lionlike.java10m.practice.day1011.codeup.codeup45;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println((int)(a+b));
        System.out.println((int)(a-b));
        System.out.println((int)(a*b));
        System.out.println((int)(a/b));
        System.out.println((int)(a%b));
        double h =a/b;
        System.out.printf("%.2f",h);
    }
}

