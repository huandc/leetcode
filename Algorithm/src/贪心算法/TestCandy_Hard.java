package 贪心算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/***
 *
 *题目描述
 * 一群孩子站成一排，每一个孩子有自己的评分。现在需要给这些孩子发糖果，规则是如果一
 * 个孩子的评分比自己身旁的一个孩子要高，那么这个孩子就必须得到比身旁孩子更多的糖果；所
 * 有孩子至少要有一个糖果。求解最少需要多少个糖果。
 *
 * 输入输出样例
 * 输入是一个数组，表示孩子的评分。输出是最少糖果的数量。
 *Input: [1,0,2]
 * Output: 5
 */

public class TestCandy_Hard {
    public static void main(String[] args) {
//        int[] childs = new int[]{1, 0, 2};
//        System.out.println(candy(childs));
        int[] childs = new int[]{1, 2, 87, 87, 87, 2, 1};
        System.out.println(candy(childs));

    }

    public static int candy(int[] ratings) {

        //给每个人分一个糖果
        int sum = 0;
        int[] arr = ratings.clone();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        if (ratings.length < 2)  return ratings.length;
        //先从左往右遍历一遍，如果右边孩子的评分比左边的高，则右边孩子的糖果数更新为左边孩子的
        //糖果数加 1；
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        //再从右往左遍历一遍，如果左边孩子的评分比右边的高，且左边孩子当前的糖果数
        //不大于右边孩子的糖果数，则左边孩子的糖果数更新为右边孩子的糖果数加 1。
        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i] < ratings[i - 1]) {
                if(arr[i]+1 > arr[i-1]){
                    arr[i-1] = arr[i]+1;
                }else {
                    arr[i-1] = arr[i-1];
                }

            }
        }
        for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
