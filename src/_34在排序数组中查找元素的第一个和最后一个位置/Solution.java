package _34在排序数组中查找元素的第一个和最后一个位置;

public class Solution {
    public static void main(String[] args) {

        System.out.println(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)[0] + "  " + searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)[1]);
        System.out.println(searchRange(new int[]{1}, 1)[0] + "  " + searchRange(new int[]{1}, 1)[1]);
        System.out.println("12");
    }

    public static int[] searchRange(int[] nums, int target) {


        /*
            先使用二分法找到一个 mid 位置的数字等于target
            然后在 0-mid 处倒着找最后一个target
            然后在 mid-nums.length 处正着找最后一个target
            如果 两个位置不相等 则返回 两个位置
            如果相等说明只有一个target 返回两次即可
         */

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            //先使用二分法找到一个 mid 位置的数字等于target
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                break;
            } else if (nums[mid] < target) {
                left++;
            } else if (nums[mid] > target) {
                right--;
            }
        }
        //没有找到返回[-1, -1]
        if (left > right) {
            return new int[]{-1, -1};
        }
        left = mid;
        right = mid;
        //找左边
        //然后在 0-mid 处倒着找最后一个target
        while (left > 0) {
            if (nums[left - 1] == target) {
                left = left - 1;
            } else break;
        }
        // 然后在 mid-nums.length 处正着找最后一个target
        while (right < nums.length - 1) {
            if (nums[right + 1] == target) {
                right = right + 1;
            } else break;
        }
        //判断返回
        if (left == right) {
            return new int[]{mid, mid};
        } else {
            return new int[]{left, right};
        }


    }
}
