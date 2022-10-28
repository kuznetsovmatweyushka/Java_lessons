package Seminar_3.Homework;

import java.util.Arrays;

public class Horse {
    public static int N = 5;
    public static int[] row = {2, 1, -1, -2, -2, -1, 1, 2, 2};
    public static int[] col = {1, 2, 2, 1, -1, -2, -2, -1, 1};

    private static boolean possiblePos(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N) {
            return false;
        }
        return true;
    }

    private static void printRes(int[][] visit) {
        for (var res : visit) {
            System.out.println(Arrays.toString(res));
        }
        System.out.println();
    }

    public static void horse(int[][] visit, int x, int y, int pos) {
        visit[x][y] = pos;
        if (pos >= N * N) {
            printRes(visit);
            visit[x][y] = 0;
            return;
        }
        for (int k = 0; k < 8; k++) {
            int newX = x + row[k];
            int newY = y + col[k];
            if (possiblePos(newX, newY) && visit[newX][newY] == 0) {
                horse(visit, newX, newY, pos + 1);
            }
        }
        visit[x][y] = 0;
    }

    public static void main(String[] args) {
        int[][] visit = new int[N][N];
        int pos = 1;
        horse(visit, 0, 0, pos);
    }
}
