package leetcode;

public class leetq1 {
    public static int[][] tranpose(int[][]matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] tranMatrix= new int [n][m];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                tranMatrix[j][i]=matrix[i][j];
            }
        }
        return tranMatrix;
    }

    public static void main(String[] args){
        int[][]matrix = new int[][]{{1,2},{2,1}};
        System.out.println(tranpose(matrix));
    }

}
