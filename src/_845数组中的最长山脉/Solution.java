package _845数组中的最长山脉;

public class Solution {

    public static void main(String[] args) {

        longestMountain(new int[]{2,1,4,7,3,2,5});
        longestMountain(new int[]{2,2,2});
    }

    public static int longestMountain(int[] A) {
        /*
        先找出比两边大的点
        左右寻找比他小的 left,right
        当长度大于3时候 (right-left+1)>=3
        和max比较
         */
        int max_len=0;
        int len = A.length;
        int left,right;
        for (int i = 1; i < len-1; i++) {
            if (A[i-1]<A[i]&&A[i]>A[i+1]){
                left=i-1;
                right=i+1;
                while (--left>=1&&A[left-1]<A[left]){
//                    left--;
                }
                while (++right<len-1&&A[right+1]<A[right]){
//                    right++;
                }
                if ((right-left+1)>=3){
                    max_len = (right-left+1)>max_len?(right-left+1):max_len;
                }
            }
        }

        System.out.println("max_len : "+max_len);
        return max_len;
    }
}
