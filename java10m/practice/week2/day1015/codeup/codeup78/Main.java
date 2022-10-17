package lionlike.java10m.practice.week2.day1015.codeup.codeup78;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long sum = 0;

        for (long i = 0; i<=num; i++) {
            if(i%2==0){
                sum += i;
            }

        }
        System.out.println(sum);

        sc.close();

    }

}
