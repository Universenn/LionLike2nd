
package lionlike.java10m.week1.day1007.codeup.Codeup35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = Integer.parseInt(a,16);
        System.out.println(Integer.toOctalString(b));

    }
}