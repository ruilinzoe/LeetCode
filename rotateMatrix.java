package leetcode;

import java.util.Arrays;

public class rotateMatrix {
    public static void rotate(int[][] matrix) {
        tranpose(matrix);
        reflect(matrix);
    }

    public static void tranpose(int[][] matrix) {
        int m = matrix.length;
        int temp;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void reflect(int[][] matrix) {
        int m = matrix.length;
        int temp;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][m - 1 - j];
                matrix[i][m - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
//            System.out.println("[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("  ");
        }
    }
}
