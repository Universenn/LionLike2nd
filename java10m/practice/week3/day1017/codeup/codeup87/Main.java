package lionlike.java10m.practice.week3.day1017.codeup.codeup87;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1 ; true; i++) {
            sum += i;
            if(sum>=num){
                System.out.println(sum);
                break;
            }
        }
    }
}