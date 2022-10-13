package lionlike.java10m.practice.day1013.codeup.codeup67;

import java.util.Scanner;

public class Main {
    public void numberDistinction(int a){
        if (a%2==0) {System.out.println("even");}
        else {System.out.println("odd");}
    }

    public void numberPlusMinus(int b){
        if (b>0) {System.out.println("plus");}
        else {System.out.println("minus");}
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();

        main.numberPlusMinus(a);
        main.numberDistinction(a);

//        main.numberDistinction(b);
//        main.numberDistinction(c);

    }
}