package _215数组中的第K个最大元素;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {

        System.out.println(findKthLargest(new int[]{1}, 1));
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    public static int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int target = nums.length - k;
        int mid;
        while (left < right) {
            //二分法 对两边遍历
            //快排 每次都会把某个元素放在指定位置
            //当吧targrt位置放在其最终位置时,直接返回
            mid = quickSelection(nums, left, right);
            if (mid == target) {
                return nums[mid];
            } else if (mid > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

    private static int quickSelection(int[] nums, int left, int right) {
        //打乱
        if (left<right){
           Random random=new Random(System.currentTimeMillis());
           int randionIndex = left+1+random.nextInt(right-left);
           swap(nums,left,randionIndex);
        }

        int i = left + 1;
        int j = right;
        while (true) {
            while (i < right && nums[i] <= nums[left]) {
                ++i;
            }
            while (left < j && nums[j] >= nums[left]) {
                --j;
            }
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, left, j);

        return j;
    }

    private static void swap(int[] nums, int a, int b) {
        nums[a]=nums[a]+nums[b];
        nums[b]=nums[a]-nums[b];
        nums[a]=nums[a]-nums[b];
    }
}
