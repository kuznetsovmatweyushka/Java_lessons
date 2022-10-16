package Seminar_1.Homework;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0p";
        System.out.println(isPalindrome(s));
    }

    static boolean palindrome(StringBuilder str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        String sLower = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < sLower.length(); i++) {
            if (Character.isLetterOrDigit(sLower.charAt(i))) {
                str.append(sLower.charAt(i));
            }
        }
        return palindrome(str);
    }

}
