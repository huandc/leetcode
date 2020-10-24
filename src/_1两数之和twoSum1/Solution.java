package _1两数之和twoSum1;

class Solution {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {

        int len = nums.length;
        if (len < 1) {
            return null;
        }
        for (int i = 0; i < len; i++) {
            int R = len - 1;
            while (i < R) {
                int sum = nums[i] + nums[R];
                if (sum == target) {
                    return new int[]{i, R};
                }
                R--;
            }
        }
        return null;
    }
}