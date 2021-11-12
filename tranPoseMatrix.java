package leetcode;

public class tranPoseMatrix {
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
        int[][]matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        tranpose(matrix);
        for(int i = 0; i < matrix.length; i++)

        {
//            System.out.println("[");
            for(int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println("  ");
        }
    }


}
