package _14最长公共前缀longestCommonPrefix;

import java.util.Arrays;



public class Solution {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"bdddd", "bddddccccc", "bd"}));
        System.out.println(longestCommonPrefix(new String[]{}));

    }

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        Arrays.sort(strs);
        strs = new String[]{strs[0],strs[strs.length-1]};


        String res="";
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == strs[1].charAt(i)){
                res += strs[0].charAt(i);
            }else {
                break;
            }
        }
        return res;

    }
}
