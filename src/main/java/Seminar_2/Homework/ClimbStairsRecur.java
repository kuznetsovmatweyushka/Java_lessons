package Seminar_2.Homework;

public class ClimbStairsRecur {
    public static void main(String[] args) {
        int n = 44;
        System.out.println(climbStairs(n));

    }
    public static int climbStairs(int n) {
        if (n == 0 ) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n-2) + climbStairs(n-1);
        }
}
