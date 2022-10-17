package lionlike.java10m.practice.week2.day1009.Polymorphism;

public class Crocodile extends Animal {
    @Override
    public String getFood() {
        return "악어는 닭";
    }
    @Override
    public int animalAge(){
        return 23;
    }
    @Override
    public void bark() {
        System.out.println("짖기 crocodile");
    }
}
