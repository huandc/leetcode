package _524通过删除字母匹配到字典里最长单词;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        List<String> d = new ArrayList<>();
//        d.add("ale");
//        d.add( "apple");
//        d.add("monkey");
//        d.add("plea");
//        System.out.println(findLongestWord("abpcplea", d));


        List<String> d = new ArrayList<>();
        d.add("ba");
        d.add("ab");
        d.add("a");
        d.add("b");
        System.out.println(findLongestWord("bab", d));


        System.out.println(findLongestWord("aewfafwafjlwajflwajflwafj", Arrays.asList(new String[]{"apple", "ewaf", "awefawfwaf", "awef", "awefe", "ewafeffewafewf"})));
        System.out.println(findLongestWord("apple", Arrays.asList(new String[]{"zxc", "vbn"})));


    }

    public static String findLongestWord(String s, List<String> d) {

        String result = "";
        int s_left = 0, d_left = 0;
        for (String d1 : d) {
            s_left = 0;//s 的指针
            d_left = 0;//d 中每个字符串的指针
            while (s_left < s.length() && d_left < d1.length()) {
                if (s.charAt(s_left) == d1.charAt(d_left)) {
                    s_left++;//当字符相等 两个指针后移
                    d_left++;
                    continue;
                } else {
                    //当字符不相等,s的字符串后移
                    s_left++;
                }
            }
            if (d_left == d1.length()) {
                // 当以上循环结束后 d_left==d1.length()  说明d1字符串走到了最后 并且都存在s 中
                // d1字符串存在的话
                // 当d1的大于result的长度时  result =d1;
                // 当d1的等于result的长度时  比较两个字符串 将小的放在前面
                if ((d1.length() > result.length()) || (d1.length() == result.length() && result.compareTo(d1) > 0)) {
                    result = d1;
                }

            }
        }

        return result;
    }
}
