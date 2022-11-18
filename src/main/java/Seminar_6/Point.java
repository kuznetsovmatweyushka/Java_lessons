package Seminar_6;

public class Point {
    private int x;
    private int y;
    //собственный конструктор
//    public Point(int x_coord, int y_coord){
//        System.out.println("Точка создана!");
//        System.out.println("Координата X: " + x_coord + "; Координата Y: " + y_coord);
//    }

    public int setX(int x_coord) {
        x = x_coord;
        return x;
    }

    public int setY(int y_coord) {
        y = y_coord;
        return y;
    }

    public void getCoord() {
        System.out.println("Координата X: " + x + "; Координата Y: " + y);
    }

    public static void main(String[] args) {
        Point a = new Point();
        a.setX(10);
        a.setY(20);
        a.getCoord();
        Point b = new Point();
        b.setX(12);
        b.setY(11);
        b.getCoord();
    }
}
