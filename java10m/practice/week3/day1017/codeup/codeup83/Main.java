package lionlike.java10m.practice.week3.day1017.codeup.codeup83;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i%3==0){
                System.out.print("X ");
            }
            else {System.out.print(i+" ");}

        }

    }

}
