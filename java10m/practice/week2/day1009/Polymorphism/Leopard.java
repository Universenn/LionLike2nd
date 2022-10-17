package lionlike.java10m.practice.week2.day1009.Polymorphism;

public class Leopard extends Animal {

    @Override
    public String getFood() {
        return "표범은 산양";
    }
    @Override
    public int animalAge(){
        return 25;
    }
    public void bark() {
        System.out.println("짖기 Leopard");
    }
}
