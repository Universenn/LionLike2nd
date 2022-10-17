package lionlike.java10m.practice.week2.day1009.Constructor;

class HouseDog extends Dog {
    HouseDog() {}

    public HouseDog(String name) {  //
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }


    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}