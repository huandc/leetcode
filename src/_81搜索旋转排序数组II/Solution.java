package _81搜索旋转排序数组II;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2, 5, 6, 0, 0, 1, 2}, 1));
//        System.out.println(search(new int[]{1, 1, 3, 1}, 3));
    }

    public static boolean search(int[] nums, int target) {

        //第一种 直接查找
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==target) return true;
//        }

        //第二种 排序后二分查找

        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[start] == nums[mid]) {
                //无法判断那个是增序的
                ++start;
            } else if (nums[mid] <= nums[end]) {
                //右边增序
                if (target > nums[mid] && target <= nums[end]) {
                    //在 mid 到 end 之间
                    start = mid + 1;
                } else {
                    //在 start 到mid 之间
                    end = mid - 1;
                }
            } else {
                //左边是增序的
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return false;
    }
}