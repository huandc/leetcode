package 贪心算法;

import java.util.Arrays;

/**
 * 题目描述
 * 有一群孩子和一堆饼干，每个孩子有一个饥饿度，每个饼干都有一个大小。每个孩子只能吃
 * 最多一个饼干，且只有饼干的大小大于孩子的饥饿度时，这个孩子才能吃饱。求解最多有多少孩
 * 子可以吃饱。
 *
 *
 * 输入输出样例
 * 输入两个数组，分别代表孩子的饥饿度和饼干的大小。输出最多有多少孩子可以吃饱的数
 * 量
 * Input: [1,2], [1,2,3]
 * Output: 2
 */
public class Test01 {
    public static void main(String[] args) {

        int[] child = new int[]{1, 2};
        int[] cookies = new int[]{1, 2, 3};
        int res = findContentChild(child, cookies);
        System.out.println(res);
    }

    public static int findContentChild(int[] child, int[] cookies) {

        int res = 0;
        Arrays.sort(child);
        Arrays.sort(cookies);
        int ch = 0;
        int co = 0;
        while (ch < child.length && co < cookies.length) {
            if (child[ch] <= cookies[co]) {
                ch++;
            }
            ch++;
        }

        return ch;

    }
}
