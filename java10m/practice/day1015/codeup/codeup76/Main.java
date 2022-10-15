package lionlike.java10m.practice.day1015.codeup.codeup76;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char num = sc.nextLine().charAt(0);
//        char num2 = (char) (num-1); // test
//        System.out.println(num2);
//        char alphabet = 97;  // a
        char alphabet = 'a';

        for (char c = alphabet; c<=num; c++ ) { // 정방향
            System.out.printf("%c ",c);
        }

//        for (char c = num; c>=alphabet;c-- ) { // 반대로
//            System.out.printf("%c ",c);
//        }


    }

}
