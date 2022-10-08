package lionlike.java10m.week1.day1007.jumptojava.q1;

public class Sample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());
        UpgradeCalculator upcal = new UpgradeCalculator();
        upcal.add(10);
        upcal.minus(2);
        System.out.println(upcal.getValue());

    }

}
