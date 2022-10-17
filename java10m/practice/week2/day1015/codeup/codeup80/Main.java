package lionlike.java10m.practice.week2.day1015.codeup.codeup80;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum = 0;
        for (int i = 1; i < num; i++){
            sum += i;
            if (sum>=num){
                System.out.println(i);
                break;
            }
        }
    }
}

