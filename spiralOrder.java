package leetcode;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        while (spiral.size() < rows * columns) {
            for (int col = left; col <= right; col++) {
                spiral.add(matrix[top][col]);
            }
            for (int row = top + 1; row <= bottom; row++) {
                spiral.add(matrix[row][right]);
            }
            if (top != bottom) {
                for (int col = right - 1; col >= left; col--) {
                    spiral.add(matrix[bottom][col]);
                }
            }
            if (left != right) {
                for (int row = bottom - 1; row > top; row--) {
                    spiral.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return spiral;

    }


    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                 };

        System.out.println(spiralOrder(a));
    }
}
