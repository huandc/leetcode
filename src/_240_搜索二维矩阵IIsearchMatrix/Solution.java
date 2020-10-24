package _240_搜索二维矩阵IIsearchMatrix;

public class Solution {
    public static void main(String[] args) {

    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        int i;
        for (i = 0; i < matrix.length; i++) {
            if (matrix[i][0] < target && matrix[i][matrix[0].length] > target){
                    break;
            }
        }
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j]==target){
                return true;
            }
        }

        return false;
    }
}
