package lionlike.java10m.practice.week2.day1010.calculator;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int plus(){return num1+num2;}
    int minus(){return num1-num2;}
    int mult(){return num1*num2;}
    int div(){return num1/num2;}


}
