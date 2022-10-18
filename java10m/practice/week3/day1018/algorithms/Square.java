package lionlike.java10m.practice.week3.day1018.algorithms;

import java.util.Scanner;

public class Square {
    private String letter = "*";
    public void squarePrint(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }
    public void squarePrint(int num, String letter){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Square square = new Square();
        square.squarePrint(num);
        square.squarePrint(num,"#");

    }
}
