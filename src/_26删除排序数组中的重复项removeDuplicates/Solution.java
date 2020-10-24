package _26删除排序数组中的重复项removeDuplicates;

public class Solution {
    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(removeDuplicates(new int[]{1, 2}));
        System.out.println(removeDuplicates(new int[]{1, 1}));
        System.out.println(removeDuplicates(new int[]{1, 1, 1}));
        System.out.println(removeDuplicates(new int[]{1, 2, 3}));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
