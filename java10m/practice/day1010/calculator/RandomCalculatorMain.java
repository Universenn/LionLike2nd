package lionlike.java10m.practice.day1010.calculator;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();

        RandomCalculator rd = new RandomCalculator(3, randomNumberCreator);

        System.out.println("랜덤 정수 : "+randomNumberCreator.numberCreat());
        System.out.println("랜덤 정수 더하기 : "+rd.plus());
        System.out.println("랜덤 정수 빼기 : "+rd.minus());
        System.out.println("랜덤 정수 곱하기 : "+rd.mult());
        System.out.println("랜덤 정수 나누기 : "+rd.div());



    }
}
