package _28实现strStr;

public class Solution {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "sippia"));
        System.out.println(strStr("mississippi", "issipi"));
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("hello", ""));
        System.out.println(strStr("aaaaaaa", "ll"));
        System.out.println(strStr("fafsdfasdasdasdasdasd", "asd"));
        System.out.println(strStr("aaaaaaaaaavvvaaaa", "aav"));
    }

    public static int strStr(String haystack, String needle) {

        //直接循环挨个字符匹配
        //当从前 后两个匹配时 会提升速度


//        int m = haystack.length();
//        int n=needle.length();
//        if (needle.length() == 0) return 0;
//        int k;
//        for (int i = 0; i <= m - n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (haystack.charAt(i + j) != needle.charAt(j)){
//                    break;
//                }
//                if (j == n - 1) {
//                    return i;
//                }
//            }
//        }
//        return -1;




        int m = haystack.length();
        int n=needle.length();
        if (n == 0) return 0;
        int k=n;
        for (int i = 0; i <= m - n; i++) {
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }else if(haystack.charAt(i + k-j-1) != needle.charAt(k-j-1)){
                    //从两边比较 如果前面相等 后面不相等也退出这次循环
                    break;
                }
                if (j == n - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
