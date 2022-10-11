package lionlike.java10m.practice.day1011.codeup1278;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cnt = 0;

        while (x!=0){
            x = x/10;
            cnt = cnt + 1 ;
        }
        System.out.println(cnt);


    }

}
