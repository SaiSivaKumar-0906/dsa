import java.util.Arrays;

public class eightsixseven {
     public static void main(String[] args){
      int[][] three = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };

      int[][] four = transpose(three);
      System.out.println(Arrays.toString(four[0]));
      System.out.println(Arrays.toString(four[1]));
      System.out.println(Arrays.toString(four[2]));
     }
    static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] transposeMatrix = new int[m][n];
        
        for( int i = 0 ; i < n ; ++i){
            for (int j = 0 ; j <m ; ++j){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}
