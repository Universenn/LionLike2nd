package lionlike.java10m.practice.week2.day1010.calculator;

public class RandomNumberCreator implements NumberCreator{

    @Override
    public int numberCreat() {
        return (int)(Math.random()*10+1);
    }
}
