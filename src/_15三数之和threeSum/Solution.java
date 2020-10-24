package _15三数之和threeSum;

import java.util.*;

/**
 *给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 *给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
//        System.out.println(_15三数之和threeSum(nums));
//        int[] nums2 = new int[0];
//        System.out.println(_15三数之和threeSum(nums2));
//        nums = new int[]{0, 0};
//        System.out.println(_15三数之和threeSum(nums));
        nums = new int[]{0, 0, 0};
        System.out.println(threeSum(nums));
//        nums = new int[]{-1, 0, 1, 0};
//        System.out.println(_15三数之和threeSum(nums));
//        nums = new int[]{3, 0, -2, -1, 1, 2};
//        System.out.println(_15三数之和threeSum(nums));
//
        nums = new int[]{4, -10, -11, -12, -8, -12, -14, -11, -6, 2, -4, 2, 3, 12, -3, -12, -14,
                -12, -8, -9, -6, -3, 10, 2, 14, 10, 7, -7, -9, 0, -9, 10, -2, -5, 14,
                5, -9, 7, 9, 0, -14, 12, 10, 4, 9, -8, 8, 11, -5, -15, -13, -3, -11,
                4, 14, 11, -1, -2, -11, 5, 14, -4, -8, -3, 6, -9, 9, 12, 6, 3, -10, 7, 0, -15,
                -3, -13, -8, 12, 13, -5, 12, -15, 7, 8, -4, -2, 4, 2, 3, 9, -8, 2, -10, -1, 6,
                3, -2, 0, -7, 11, -12, -2, 3, -4, -2, 7, -2, -3, 4, -12,
                -1, 1, 10, 13, -5, -9, -12, 6, 8, 7, 0, 7, -6, 5, 13, 8, -14, -12};
        long startTime = System.currentTimeMillis();
        System.out.println(threeSum(nums));
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间
    }


    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        if (len < 2) {
            return res;
        }
        for (int i = 0; i < len ; i++) {
            if (nums[i] > 0) {
                return res;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[left], nums[right])));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left > right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                }
            }
        }
        return res;
    }
}
