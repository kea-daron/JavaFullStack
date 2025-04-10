package array2D;

public class Main {
    public static void main(String[] args) {
        int[][] array2D = new int[3][2];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = array2D[i][j];
                System.out.print(array2D[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
