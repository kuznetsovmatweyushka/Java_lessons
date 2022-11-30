package OOP.WaveAlgoritm;

public class MapAlg {
    int width;
    int height;
    private int[][] map;
    static final int WALL = 99;


    public MapAlg(int width, int height) {
        this.width = width;
        this.height = height;
        map = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((int) (Math.random() * width) % 2 == 0)
                    map[i][j] = WALL;
                else map[i][j] = -1;
            }
        }
        for (int i = 0; i < width; i++) {
            map[i][0] = WALL;
            map[width - 1][i] = WALL;
        }
        for (int i = 0; i < height; i++) {
            map[0][i] = WALL;
            map[i][height - 1] = WALL;
        }
    }

    public int[][] getMap() {
        return map;
    }

    private static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void printer(int[][] map) {
        for (int[] row : map) {
            MapAlg.printRow(row);
        }
    }
}
