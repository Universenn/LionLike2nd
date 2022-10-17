package lionlike.java10m.idknow.day1007.jumptojava.q7;

public class Sample {
    public static void main(String[] args) {
        MineralCalulator cal = new MineralCalulator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }
}
