package lionlike.java10m.practice.day1011.codeup.codeup46;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = a+b+c;
        System.out.println((int)d);
        double f = (a+b+c)/3;
        System.out.printf("%.1f",f);

    }
}

