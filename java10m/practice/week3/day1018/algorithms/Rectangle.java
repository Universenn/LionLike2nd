package lionlike.java10m.practice.week3.day1018.algorithms;

import java.util.Scanner;

public class Rectangle {
    public void rectanglePrint(int num1, int num2){
        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Rectangle rectangle = new Rectangle();

        rectangle.rectanglePrint(x,y);
    }
}
