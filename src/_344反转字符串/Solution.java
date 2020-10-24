package _344反转字符串reverseString;

public class Solution {


    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {

        char temp;
        for (int i = 0, j = s.length-1; i < s.length / 2; i++,j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }

        System.out.println(s);
    }
}
