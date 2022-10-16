package Seminar_2;

public class HanoiTower {
    public static void main(String[] args) {
        tower(5, "1", "3", "2");
    }

    public static void tower(int n, String source, String target, String buffer) {
        if (n == 1) {
            System.out.printf("%d ball from %s to %s\n", n, source, target);
            return;
        }
        tower(n - 1, source, buffer, target);
        System.out.printf("%d ball from %s to %s\n", n, source, target);
        tower(n - 1, buffer, target, source);
    }
}