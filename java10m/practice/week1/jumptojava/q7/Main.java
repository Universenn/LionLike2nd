package lionlike.java10m.practice.week1.jumptojava.q7;

public class Main {
    public static void main(String[] args) {
        MineralCalulator mi = new MineralCalulator();

        mi.add(new Gold());
        mi.add(new Silver());
        mi.add(new Bronze());
        System.out.println(mi.getValue());
    }
}
