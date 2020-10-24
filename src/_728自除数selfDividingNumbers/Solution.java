package _728自除数selfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        System.out.println(selfDividingNumbers(1, 1000));
    }

    public static boolean fun(int n) {

        int num = n;
        int i;
        //n um =n 取原数字
        // 当 i 取最后一位数 当为0时候 直接返回false
        // 当 num% i取余不等于0 时候 不满足条件 返回false
        // 执行完时, 直接返回true
        while (n > 0) {
            i = n % 10;
            if (i == 0) return false;
            if (num % i != 0) return false;
            n = n / 10;
        }
        return true;
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        //循环判断 符合的话添加到list中
        for (int i = left; i <= right; i++) {
            if (fun(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
