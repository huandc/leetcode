package checkPossibility665;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        System.out.println(checkPossibility(new int[]{4, 2, 1}));
        System.out.println(checkPossibility(new int[]{4, 2, 3}));


        System.out.println(checkPossibility(new int[]{3, 4, 2, 3}));
        System.out.println(checkPossibility(new int[]{-1, 4, 2, 3}));

    }

    public static boolean checkPossibility(int[] nums) {

        /**
         *  当第一次出现 nums[i-1] > nums[i]的时候
         *  并且 前面一个大于nums[i] 就将nums[i] 改为nums[i-1]
         *   相反 当前面小于nums[i] 将前面变为nums[i]
         */
        int count = 0;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i-1] > nums[i]){
                count++;
                if (count>=2) return false;
                if(i-2>=0 && nums[i-2] > nums[i]) {
                    //拐点前一位元素＜拐点后一位元素时，选择向上移的方法
                    nums[i] = nums[i-1];
                }else {
                    //如果前一位元素≥后一位元素，就只能采用上移才能保证向下拐点消除
                    nums[i-1]=nums[i];
                }
            }
        }
        return true;
    }
}
