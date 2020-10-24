package _27移除元素;

public class Solution {

    public static void main(String[] args) {

        int[] nums = new int[]{3, 2, 2, 3};

        removeElement(nums, 2);
        for (int num : nums) {
            System.out.print(num + "  ");
        }
        System.out.println();

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        removeElement(nums, 2);
        for (int num : nums) {
            System.out.print(num + "  ");
        }

        System.out.println();

        nums = new int[]{0, 1, 2, 2, 3, 3, 5, 4, 5, 2, 1, 1, 1, 2, 2, 3, 6, 5, 4, 1};
        removeElement(nums, 2);
        for (int num : nums) {
            System.out.print(num + "  ");
        }
    }

    public static int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val){
                k++;
            }else {
                nums[i-k]=nums[i];
            }
        }

        System.out.println(nums.length-k);
        return nums.length-k ;
    }
}
