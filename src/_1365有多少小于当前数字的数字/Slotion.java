package _1365有多少小于当前数字的数字;

import java.util.HashMap;
import java.util.Map;

public class Slotion {
    public static void main(String[] args) {
        smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
        smallerNumbersThanCurrent(new int[]{6,5,4,8});
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int[] numss=nums.clone();
        int len = nums.length;
        int temp;
        int min;
        for (int i = 0; i < len; i++) {
            min=i;
            for (int j = i; j < len; j++) {
                if (nums[min]>nums[j]){
                    min=j;
                }
            }
            if (min!=i){
                temp=nums[i];
                nums[i]=nums[min];
                nums[min]=temp;
            }
            if (map.get(nums[i])==null){
                map.put(nums[i],i);
                System.out.println("");
            }
        }
        System.out.println(map);
        for (int i = 0; i < len; i++) {
            nums[i]=map.get(numss[i]);
        }

        return nums;



    }

}
