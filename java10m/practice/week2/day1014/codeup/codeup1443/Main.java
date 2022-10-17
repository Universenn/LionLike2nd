package lionlike.java10m.practice.week2.day1014.codeup.codeup1443;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i< arr.length; i++) {
            for (int j = i; j>0; j--) {
                if (arr[j] < arr[j-1]) { //arr[1] < arr[0]
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i]);
            System.out.println();
        }
    }
}
