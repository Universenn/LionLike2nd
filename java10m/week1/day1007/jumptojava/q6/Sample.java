package lionlike.java10m.week1.day1007.jumptojava.q6;

public class Sample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }
}
