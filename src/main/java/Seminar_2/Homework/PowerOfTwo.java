package Seminar_2.Homework;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        else if (n % 2 != 0 || n == 0)
            return false;

        return isPowerOfTwo(n / 2);
    }
}
