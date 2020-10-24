package _680验证回文字符串;

/**
 *给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 * 示例 1:
 *
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 *
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 *
 */

class Solution {
    public static void main(String[] args) {
//        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
        System.out.println(validPalindrome("ebcbbececabbacecbbcbe"));
//        System.out.println(validPalindrome("aba"));
//        System.out.println(validPalindrome("abca"));
//        System.out.println(validPalindrome("aabbccdccbbaa"));
//        System.out.println(validPalindrome("aabbccdtfccbbaa"));
//        System.out.println(validPalindrome("deeee"));
//        System.out.println(validPalindrome("eedede"));
//        System.out.println(validPalindrome("cbbcc"));
    }

    public static boolean validPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        StringBuilder str2 = new StringBuilder(s);

        boolean flag1 = true;
        boolean flag2 = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            } else {
//                return valid2(str.deleteCharAt(i).toString()) || valid2(str2.deleteCharAt(s.length()-1-i).toString());

                str.deleteCharAt(i);
                for (int t1 = 0; t1 < str.length()/2; t1++) {
                    System.out.println(str);
                    if (str.charAt(t1) != str.charAt(str.length() - 1 - t1)) {
                        flag1 = false;
                        break;
                    }
                }
                str2.deleteCharAt(s.length() - 1 - i);
                for (int t2 = 0; t2 <str2.length() ; t2++) {
                    System.out.println(str);
                    if (str2.charAt(t2) != str2.charAt(str2.length() - 1 - t2)) {
                        flag2 = false;
                        break;
                    }
                }
                break;
            }
        }
        return flag1 || flag2;
    }

}