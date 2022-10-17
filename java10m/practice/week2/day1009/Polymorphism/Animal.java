package lionlike.java10m.practice.week2.day1009.Polymorphism;

class Animal implements Age,Predator,Barkable {
    String name;

    void setName(String name) {
        this.name = name;
    }

    @Override
    public int animalAge(){
        return 0;
    }

    @Override
    public String getFood() {
        return null;
    }

    @Override
    public void bark() {
    }
}
