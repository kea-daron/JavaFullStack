package array2D;

public class Test {
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 2, 3},
                {1, 2, 3}};
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
