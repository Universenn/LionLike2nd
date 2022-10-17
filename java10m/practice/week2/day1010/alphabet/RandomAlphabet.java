package lionlike.java10m.practice.week2.day1010.alphabet;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {

        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();
        char alphabet = alphabetGenerator.generate(0);


        Set<Character> characters = new HashSet<>();

        int cnt = 0;
        while (cnt < 30) {
            characters.add(alphabetGenerator.generate(0));
            cnt += 1;
        }

        System.out.println(characters);
    }
}
