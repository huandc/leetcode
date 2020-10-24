package _540有序数组中的单一元素;
/*
        使用二分法思路
        每次判断mid 和前后两个数是否相等, 都不想等说明就是单独数 ,直接返回
        当和前面数相等的话:
            比如[3, 3, 7, 7, 10, 11, 11]
            left=0; right=6; mid=3;
            nums[mid]=7 即nums[mid] = mid[mid-1];
                当(mid+1)%2==0 前面正好有2*n个数 说明 就在后半部分
                left=mid+1即可
                当(mid+1)%2!=0 说明前面有奇数个数 ,一定存在于前面区间
                right = mid - 2;  //因为mid 和 mid-1 有两个数 需要减2
        当和后面数相等的时候:
            同样以上例子[3, 3, 7, 7, 10, 11, 11]
            left=4; right=6; mid=5;
            nums[mid]=nums[mid+1]=6;
                这时候 当(right-mid+1)%2==0 说明前面有奇数个 right =mid-1;
                当(right-mid+1)%2!=0   说明后面有奇数个 left=mid+2
        注意: 当要判断mid是否是第一个或者最后一个元素 直接返回即可
        if (mid==0||mid==nums.length-1) break;

         */
public class Solution {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        System.out.println(singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2}));
    }

    public static int singleNonDuplicate(int[] nums) {


        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {

            mid = (left + right) / 2;
            //当mid 处于第一个或者最后一个时候,直接返回;
            if (mid == 0 || mid == nums.length - 1) break;

            if (nums[mid] == nums[mid - 1]) {
                //当mid 与前一个数相等 则判断 前面是否有偶数个数
                //如果有的话 说明 单独数在后面存在 left =mid+1
                //没有的话 说明 单独数在前面存在 right = mid -2
                if ((mid + 1) % 2 == 0) {
                    left = mid + 1;
                } else {
                    right = mid - 2;
                }
            } else if (nums[mid] == nums[mid + 1]) {
                //相反 当mid 与后一个数相等 则判断 前面是否有偶数个数
                //如果有的话 说明 单独数在前面存在 right=mid-1;
                //没有的话 说明 单独数在后面存在 left=mid+2;
                if ((right-mid + 1) % 2 == 0) {
                    right = mid - 1;
                } else {
                    left = mid + 2;
                }
            } else {
                break;
            }
        }
        return nums[mid];
    }
}
