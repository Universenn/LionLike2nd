package lionlike.java10m.practice.week1.jumptojava.q2;

public class Main {
    public static void main(String[] args) {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(30);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력
    }
}
