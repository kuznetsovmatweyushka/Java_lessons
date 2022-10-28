package Seminar_3.Homework;

import java.util.ArrayList;
import java.util.List;

public class RecoveryTask {
    public static void main(String[] args) {

        restore("2? + ?5 = 69");

    }

    private static char[] textGlobal;
    private static List<Integer> operationIndexesGlobal;

    public static void restore(String text) {
        ArrayList<Integer> operIndexes = new ArrayList<>();
        char[] textChar = text.replace(" ", "").toCharArray();
        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '+' || textChar[i] == '=') {
                textChar[i] = '_';
            }
            if (textChar[i] == '?') {
                operIndexes.add(i);
            }
        }
        textGlobal = textChar;
        operationIndexesGlobal = operIndexes;

        CombWithRep(new int[operIndexes.size()], 0, 10);
    }

    private static void CombWithRep(int[] comb, int index, int K) {
        if (index == comb.length) {
            checkComb(comb);
            return;
        }

        for (int i = 0; i < K; i++) {
            comb[index] = i;
            CombWithRep(comb, index + 1, K);
        }
    }

    private static void checkComb(int[] comb) {
        for (int i = 0; i < comb.length; i++) {
            textGlobal[operationIndexesGlobal.get(i)] = Character.forDigit(comb[i], 10);
        }

        String[] numbers = String.valueOf(textGlobal).split("_");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a + b == c) {
            System.out.printf("%d + %d = %d\n", a, b, c);
        }
    }
}
