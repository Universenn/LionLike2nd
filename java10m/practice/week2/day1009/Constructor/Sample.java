package lionlike.java10m.practice.week2.day1009.Constructor;

public class Sample {
    public static void main(String[] args) {
        HouseDog hDog1 = new HouseDog();
        HouseDog hDog2 = new HouseDog("왈왈");

        hDog1.setName("멍멍");
        System.out.println(hDog1.name);

        System.out.println(hDog2.name);

    }
}