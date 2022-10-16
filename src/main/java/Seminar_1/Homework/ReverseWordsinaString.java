package Seminar_1.Homework;

import java.util.*;
//Given an input string s, reverse the order of the words.

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        String[] ss = s.split(" ");
        String res = "";
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != "") {
                words.add(ss[i]);
            }
        }
        Collections.reverse(words);
        for (int i = 0; i < words.size(); i++) {
            res += words.get(i) + " ";
        }
        return res.trim();
    }
}