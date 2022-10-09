package lionlike.java10m.practice.day1009.Polymorphism;

public class Sample {
    public static void main(String[] args) {

        Tiger ti = new Tiger();
        Lion li = new Lion();
        Leopard leo = new Leopard();
        Crocodile croco = new Crocodile();

        // 다형성 활용
        Bouncer bou = new Bouncer();
        bou.barkAnimal(ti);
        bou.barkAnimal(li);
        bou.barkAnimal(leo);
        bou.barkAnimal(croco);
        System.out.println("====================================");
        // 인스턴스 활용

        Animal cro = new Crocodile();
        cro.animalAge();
        cro.getFood();

        Zoo zo = new Zoo();
        zo.feed(croco);
        zo.age(croco);


    }
}

