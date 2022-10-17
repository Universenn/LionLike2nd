package lionlike.java10m.idknow.day1007.jumptojava.q7;

public class MineralCalulator {
    int value = 0;

    public void add(Mineral mineral){
        this.value += mineral.getValue();
    }

    public int getValue() {
        return this.value;
    }
}
