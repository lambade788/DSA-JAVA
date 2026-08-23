package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        System.out.println(frequency);
    }
}