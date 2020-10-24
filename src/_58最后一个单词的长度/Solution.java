package _58最后一个单词的长度;

public class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World  "));
    }

    public static int lengthOfLastWord(String s) {

//        String[] s1 = s.split(" ");
//        for (int i = s1.length-1; i >=0; i--) {
//            if (!s1[i].equals(" ")){
//                return s1[i].length();
//            }
//        }
//        return 0;

        int len=0;
        int max=0;
        for (int i = s.length()-1; i>=0; i--) {
            if (s.charAt(i)!=' '){
                len++;
            }else {
                if (len!=0) return len;
            }

        }

        return len;
    }
}