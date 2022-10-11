package lionlike.java10m.practice.day1011.codeup1620;

import java.util.Scanner;
public class Main {
    public int solution1(int n){
        // 각자리 수 더할 값
        int result = 0;
        // 나눌 값
        while (n!=0){
            result += n % 10;
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int n1 = sc.nextInt();
        int sum;
        while ((sum = main.solution1(n1)) != n1){
            n1 = sum;
        }
        System.out.println(sum);


    }
}

