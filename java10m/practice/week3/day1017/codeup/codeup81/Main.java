package lionlike.java10m.practice.week3.day1017.codeup.codeup81;

import java.util.Scanner;

public class Main {
    public void dicePrint(int num1, int num2){
        for (int i = 1; i<=num1; i++){
            for (int j = 1; j<=num2; j++){
                System.out.println(i+" "+j);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Main main =new Main();
        main.dicePrint(num1,num2);


    }

}
