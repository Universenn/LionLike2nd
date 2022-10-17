package lionlike.java10m.practice.week2.day1009.interfacee;

class Lion extends Animal implements Predator{
    public String getFood() {
        return this.name+" banana";
    }
}