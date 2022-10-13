package lionlike.java10m.practice.day1013.codeup.codeup68;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char grade ;

        if (a>=90) { grade = 'A';}
        else if (a>=70) { grade = 'B';}
        else if (a>=40) { grade = 'C';}
        else { grade = 'D';}
        System.out.println(grade);

    }
}
