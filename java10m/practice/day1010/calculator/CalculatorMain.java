package lionlike.java10m.practice.day1010.calculator;

public class CalculatorMain {
    public static void main(String[] args) {

        final int num1 = 5;
        final int num2 = 3;

        Calculator ca = new Calculator(num1,num2);

        System.out.println("num1 + num2 = "+ca.plus());
        System.out.println("num1 - num2 = "+ca.minus());
        System.out.println("num1 * num2 = "+ca.mult());
        System.out.println("num1 / num2 = "+ca.div());

    }
}
