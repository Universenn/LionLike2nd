package lionlike.java10m.idknow.day1007.jumptojava.sample;

public class Sample {
    int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Animal ani1 = new Animal();
//        Animal.name = "juwan"; // 클래스를 통해는 불가능 하다.
//        ani1.name = "space"; // 객체 변수
        ani1.setName("woo");
        System.out.println(ani1.name);

        Sample sample = new Sample();
        int c= sample.sum(1,2);
        System.out.println(c);


    }
}
