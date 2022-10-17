package lionlike.java10m.practice.week2.day1015.codeup.codeup79;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
            if (a[i].equals("q"))break;
        }
    }
}

