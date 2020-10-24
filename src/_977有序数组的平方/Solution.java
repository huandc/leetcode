package _977有序数组的平方;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        sortedSquares(new int[]{-1});
//        sortedSquares(new int[]{-4, -1, 0, 3, 10});
//        sortedSquares(new int[]{-7, -3, 2, 3, 11});
//        sortedSquares(new int[]{-1, -1, -1, 0, 0, 0, 2, 2, 2, 2});
    }

    public static int[] sortedSquares(int[] A) {

        List<Integer> list = new LinkedList<>();
        int[] squares = new int[A.length];

        int left = 0, right = A.length - 1;
        int p = squares.length - 1;
        while (left <= right) {
            if ( A[left] * A[left] >= A[right] * A[right]) {
                squares[p--]=A[left]*A[left];
                left++;
            }else {
                squares[p--]=A[right]*A[right];
                right--;
            }
        }



        return squares;


    }
}
