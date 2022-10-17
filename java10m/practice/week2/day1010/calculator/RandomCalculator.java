package lionlike.java10m.practice.week2.day1010.calculator;

public class RandomCalculator extends Calculator{

    public RandomCalculator(int num1, NumberCreator numberCreator) {
        super(num1, numberCreator.numberCreat());
    }
    public int getRandomNumber(){
        return 0;
    }

}
