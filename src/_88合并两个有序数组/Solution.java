package _88合并两个有序数组;

public class Solution {

    public static void main(String[] args) {

//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};

        int[] nums1 = {2,0};
        int[] nums2 = {1};
        merge(nums1,1,nums2,1);
        for (int i : nums1) {
            System.out.print(i);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

//        m = m - 1; // 指向 nums1 的末尾
//        n = n - 1; //指向 nums2 的末尾
//        int pos = m + n - 1; //  指向顽症的nums1的末尾

        int pos = m-- + n-- -1;
        while (m >= 0 && n >= 0) {
            //从后面比较 把大的放在nums1 的结尾 然后指针向前移动
            if (nums1[m] >= nums2[n]) {
                nums1[pos--] = nums1[m--];
            }else  {
                nums1[pos--] = nums2[n--];
            }
        }
        //当有一个数组添加完后 把另外一个数组所有元素从后向前添加进去
        while (n >=0 ){
            nums1[pos--] = nums2[n--];
        }


    }
}
