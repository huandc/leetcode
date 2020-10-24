package _76最小覆盖子串;


/**
 * 给你一个字符串 S、一个字符串 T 。请你设计一种算法，
 * 可以在 O(n) 的时间复杂度内，从字符串 S 里面找出：
 * 包含 T 所有字符的最小子串。
 * <p>
 * 示例：
 * <p>
 * 输入：S = "ADOBECODEBANC", T = "ABC"
 * 输出："BANC"
 *  
 * 提示：
 * 如果 S 中不存这样的子串，则返回空字符串 ""。
 * 如果 S 中存在这样的子串，我们保证它是唯一的答案。
 *
 *
 * 本题使用滑动窗口求解，即两个指针 l 和 r 都是从最左端向最右端移动，且 l 的位置一定在
 * r 的左边或重合。注意本题虽然在 for 循环里出现了一个 while 循环，但是因为 while 循环负责移
 * 动 l 指针，且 l 只会从左到右移动一次，因此总时间复杂度仍然是 O(n)。本题使用了长度为 128
 * 的数组来映射字符，也可以用哈希表替代；其中 chars 表示目前每个字符缺少的数量，flag 表示
 * 每个字符是否在 T 中存在
 */
public class Solution {
    public static void main(String[] args) {

//        String s = "ADOBECODEBANC";
//        String t ="ABC";
//        String s1 = minWindow(s, t);
//        System.out.println(s1);

        String s = "a";
        String t ="a";
        String s1 = minWindow(s, t);
        System.out.println(s1);


    }

    public static String minWindow(String s, String t) {
        if (null == s || null == t || s.length() == 0 || t.length() == 0 || t.length() > s.length()) {
            return "";
        }

        char[] T = t.toCharArray();
        char[] S = s.toCharArray();
        int[] chars = new int[128];
        boolean[] flag = new boolean[128];

        //统计t 中的字符情况
        for (int i = 0; i < T.length; i++) {
            flag[T[i]] = true;
            ++chars[T[i]];
        }
        //滑动窗口 更改统计数据
        int cnt = 0, left = 0, min_l = 0, min_size = S.length + 1;

        for (int r = 0; r < S.length; r++) {
            if (flag[S[r]]) {// r 向右边滑动
                if (--chars[S[r]] >= 0) {
                    ++cnt;
                }
                //若目前滑动窗口包含T所所有字符
                // 尝试将 l 右移,在不映像节或情况下获得最短子字符串
                while (cnt == T.length) {
                    if (r - left + 1 < min_size) {
                        min_l = left;
                        min_size = r - left + 1;
                    }
                    if (flag[S[left]] && ++chars[S[left]] > 0){
                        --cnt;
                    }
                    ++left;
                }
            }
        }
//        StringBuilder res= new StringBuilder();
//        if (min_size < S.length){
//            for (int i = min_l; i < min_l+min_size; i++) {
//                res.append(S[i]);
//            }
//        }


        return min_size > S.length? "":s.substring(min_l,min_l+min_size);
    }
}
