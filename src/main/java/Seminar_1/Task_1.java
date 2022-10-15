package Seminar_1;
//1281. Subtract the Product and Sum of Digits of an Integer
public class Task_1 {
    public static void main(String[] args) {
        int a;
        a = subtractProductAndSum(234);
        System.out.println(a);
    }
    public static int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }
}

