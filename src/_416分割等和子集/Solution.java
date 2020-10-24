package _416分割等和子集;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1, 5, 11, 5}));
        System.out.println(canPartition(new int[]{1, 2, 3, 5}));
        System.out.println(canPartition(new int[]{1, 1, 2, 3, 5, 10}));
        System.out.println(canPartition(new int[]{2,2,3,5}));
    }

    public static boolean canPartition(int[] nums) {

        Arrays.sort(nums);
        int sum1 = 0, sum2 = 0;
        int left = 0, right = nums.length - 1;
        sum1 += nums[left];
        sum2 += nums[right];
        while (left < right-1) {
            if (sum1 == sum2) break;
            if (sum1 < sum2) {
                sum1 += nums[--right];
            } else if (sum1 > sum2) {
                sum2 += nums[++left];
            }

        }
//
        System.out.println("sum1:"+sum1);
        System.out.println("sum2:"+sum2);

        return sum1 == sum2 && left==right-1;
    }
}
