package multidimensionalArrays;

// https://www.programiz.com/java-programming/multidimensional-array
public class MultidimensionalArrays {

    public static void main(String[] arg) {
        showInitialize();
        showPrint2D();
        showPrint3D();
    }

    private static void showInitialize() {
        // 2d - three rows (y), 4 columns (x)
        int[][] a = new int[3][4];

        // 3d - 3 rows (y), 4 columns (x), 2 z
        String[][][] data = new String[3][4][2];

        // 2d - initialize with values
        int[][] b = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7}
        };

        // 3d - initialize with values
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };
    }

    private static void showPrint2D() {
        int[][] b = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7}
        };

        for (int r = 0; r < b.length; r++) {
            for (int c = 0; c < b[r].length; c++) {
                System.out.println("row, column = " + r + ", " + c);
                System.out.println("value = " + b[r][c]);
            }
        }
    }

    private static void showPrint3D() {
        // 3d - initialize with values
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        for (int z = 0; z < test.length; z++) {
            for (int y = 0; y < test[z].length; y++) {
                for (int x = 0; x < test[z][y].length; x++) {
                    System.out.println("z, y, x = " + z + ", " + y + ", " + x);
                    System.out.println("value = " + test[z][y][x]);
                }
            }
        }
    }

}
