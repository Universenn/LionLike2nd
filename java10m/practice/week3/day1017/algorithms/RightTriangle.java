package lionlike.java10m.practice.week3.day1017.algorithms;

import java.util.Scanner;

public class RightTriangle {
    public void printStar(int num){
        String star = "*";
        for (int i=0; i<num; i++){
            for (int j=0; j<=i; j++){
                System.out.printf("%s",star);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        RightTriangle rt = new RightTriangle();

        rt.printStar(num);
    }
}
