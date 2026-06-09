package practice;
class Solution1 {
    public void rotateMatrix(int[][] matrix) {

        int row = matrix.length;
        int column = matrix[0].length;

        int[][] newMatrix = new int[row][column];

        int a = 0;
        int b = 0;

        for(int i=0;i<column;i++){
            a = i;
            b = i;
            for(int j=row-1;i>=0;i--){

                newMatrix[a][b] = matrix[j][i];
                b++;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){

                matrix[i][j] = newMatrix[i][j];
            }
        }
    }
}
public class RotateMatrixBy90Degrees {

    public static void main(String[] args) {

        Solution1 solution = new Solution1();

        int[][] matrix = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                matrix[i][j] = i+j;
            }
        }

        solution.rotateMatrix(matrix);

         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
             System.out.println();
        };
    }
}
