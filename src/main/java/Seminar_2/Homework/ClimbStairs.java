package Seminar_2.Homework;



public class ClimbStairs {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] memory = new int[n + 1];
        memory[0] = 1;
        memory[1] = 1;
        for (int i = 2; i <= n; i++) {
            memory[i] = memory[i - 1] + memory[i - 2];
        }
        return memory[n];
    }
}
