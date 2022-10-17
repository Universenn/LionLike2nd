package lionlike.java10m.practice.week3.day1017.codeup.codeup85;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double s = sc.nextInt();

        double result = (h*b*c*s) / 8 / 1024 / 1024;
        System.out.printf("%.1f MB",result);
    }
}