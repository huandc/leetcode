package _66加一;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        plusOne(new int[]{1, 2, 3});
        plusOne(new int[]{4, 3, 2, 1});
        plusOne(new int[]{8, 9, 9});
    }

    public static int[] plusOne(int[] digits) {

//        List<Integer> list = new LinkedList<>();
//        int flag = 0;
//        if (digits[digits.length - 1] + 1>=10){
//            list.add(0,digits[digits.length - 1] + 1-10);
//            flag=1;
//        }else {
//            list.add(0,digits[digits.length - 1] + 1);
//            flag=0;
//        }
//
//        for (int i = digits.length-2; i >=0; i--) {
//            if(digits[i]+flag >=10){
//                list.add(0,digits[i]+flag-10);
//                flag=1;
//            }else {
//                list.add(0,digits[i]+flag);
//                flag=0;
//            }
//        }
//        if (flag==1){
//            list.add(0,flag);
//        }
//
//        System.out.println(list);
//
//        int[] res = new int[list.size()];
//        int k = 0;
//        for (Integer integer : list) {
//            res[k++] = integer;
//        }
//
//        return res;

        for (int i = digits.length-1; i >= 0; i--) {
            digits[i]++;
            digits[i]=digits[i]%10;
            //当digits[i]==0 说明有进位  给下一位+1
            if (digits[i]!=0){
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
