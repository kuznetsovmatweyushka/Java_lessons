package Seminar_2.Homework;

public class Pow {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        double sol = myPow(x, n / 2);

        if (n % 2 == 0) return sol * sol;
        else if (n > 0) return sol * sol * x;
        else return (sol * sol) / x;


    }
}
