package _0000数据结构;

public class 快速排序 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5,8,4,5,2,1,2,3,6,4,2};

        quick_sort(nums,0,13);
        print(nums);
    }

    public static void quick_sort(int[] nums, int left, int right) {
        if (left + 1 >= right){
            return;
        }
        int first = left, last = right - 1, key = nums[first];
        while (first < last) {
            while (first < last && nums[last] >= key) {
                --last;
            }
            nums[first] = nums[last];
            while (first < last && nums[first] <= key) {
                ++first;
            }
            nums[last] = nums[first];
        }
        nums[first] = key;
        quick_sort(nums, left, first);
        quick_sort(nums, first + 1, right);
    }

    public static void print(int[] nums){
        for (int num : nums) {
            System.out.print(num+"  ");
        }
    }
}
