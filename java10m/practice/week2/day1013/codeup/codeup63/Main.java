package lionlike.java10m.practice.week2.day1013.codeup.codeup63;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a<b) {
            System.out.println(b);
        }else System.out.println(a);
        sc.close();

    }

}
