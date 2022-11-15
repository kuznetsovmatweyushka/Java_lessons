package Seminar_5.Homework;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String[] words1 = {"a", "a", "ab"};
        String[] words2 = {"ab"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String word : words1) {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }
        for (int i = 0; i < words2.length; i++) {
            Integer freq = map.get(words2[i]);
            if (freq != null && freq <= 1)
                map.put(words2[i], freq - 1);
        }
        int count = 0;
        for (int entry : map.values()){
            if (entry == 0){
                count ++;
            }
        }
        return count;
    }
}
