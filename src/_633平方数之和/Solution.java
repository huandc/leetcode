package _633平方数之和;

/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 *
 *left 左指针
 * right c的开方(比直接用c 可以节约大量时间)
 * mul = left * left + right * right; 计算左右的平方和
 *
 * mul == c 时候直接返回true就行
 * mul > c 时候 右指针左移 right--;
 * mul < c 时候 左指针右移 left++;
 * 到最后right < left 还没找到时;说明不存在 返回false;
 *
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(3));
        System.out.println(judgeSquareSum(4));
        System.out.println(judgeSquareSum(2));
        System.out.println(judgeSquareSum(1));
        System.out.println(judgeSquareSum(2147483647));
    }

    public static boolean judgeSquareSum(int c) {

        int left = 0;
        int right = (int) Math.sqrt(c);
        int mul = 0;
        while (left <= right) {
            mul = left * left + right * right;
            if (mul == c) return true;
            else if (mul > c) right--;
            else left++;
        }

        return false;
    }
}
