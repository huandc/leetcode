package _154寻找旋转排序数组中的最小值II;

public class Solution {
    public static void main(String[] args) {

        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMin(new int[]{2,2,2,2,2,3,5,0,1,2,2,2}));
    }

    public static int findMin(int[] nums) {


        int left = 0;
        int right = nums.length - 1;
        int mid;
        //二分法  当mid 的值与最右边相等的话 将右边左移一位
        // 当mid的值大于right的话 说明最小值存在右边 left=mid+1
        // 当mid的值小于left的话 说明最小值存在左边 right=mid
        while (left<right){
            mid=(left+right)/2;
            if (nums[mid]==nums[right]){
                right--;
            }else if (nums[mid]>nums[right]){
                left=mid+1;
            }else {
                right=mid;
            }
        }

        return nums[right];
    }
}