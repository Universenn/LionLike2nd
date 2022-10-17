package lionlike.java10m.practice.week3.day1017.algorithms;

import java.util.Scanner;

public class RightTriangle {
    private String letter = "*";
    private String space = " ";

    public RightTriangle() {
    }
    public RightTriangle(String letter) {
        this.letter = letter;
    }

    public void printStar(int num){
        for (int i=0; i<num; i++){
            for (int j=0; j<=i; j++){
                System.out.printf("%s",letter);
            }
            System.out.println();
        }
    }

    public void printStar2(int num){
        for (int i=0; i<num; i++){
            // 공백 출력  num-1-i...
            for (int j=0; j<=num-1-i; j++){
                System.out.printf("%s",space);
            }
            // 별 출력 1,3,5,7...
            for (int j=0; j<i*2+1; j++){
                System.out.printf("%s",letter);
            }
            System.out.println();
        }
    }

    public void printStar3(int num) {
        for (int i = 0; i < num; i++) {
            int space = Math.abs(num / 2 - i);

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < num - 2 * space; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        RightTriangle rt = new RightTriangle();

//        rt.printStar(num);
        rt.printStar2(num);
        rt.printStar3(num);
    }
}
