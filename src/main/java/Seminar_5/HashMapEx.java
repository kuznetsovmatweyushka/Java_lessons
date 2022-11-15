package Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        String text = "asfajshdbfjdbfanskjdfsandFAGAFGf233123";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currChar = text.charAt(i);
            map.putIfAbsent(currChar, 0);
            map.put(currChar, map.get(currChar) + 1);
        }

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
