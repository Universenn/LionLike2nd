package lionlike.java10m.practice.day1012.hospital.domain;

public class Hospitalparser implements Parser<Hospital>{
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(splitted[0]);
    }
}
