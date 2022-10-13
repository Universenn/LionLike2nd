package lionlike.java10m.practice.day1013.codeup.codeup66;

import java.util.Scanner;

public class Main {
    public void numberDistinction(int a){
        if (a%2==0) {System.out.println("even");}
        else {System.out.println("odd");}
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        main.numberDistinction(a);
        main.numberDistinction(b);
        main.numberDistinction(c);

    }
}