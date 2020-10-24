package 剑指Offer03数组中重复的数字;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        System.out.println(findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }

    public static int findRepeatNumber(int[] nums) {

        int[] res = new int[nums.length];
        for (int num : nums) {
            ++res[num];
            if (res[num]>1) return num;
        }

        return -1;
    }

}
