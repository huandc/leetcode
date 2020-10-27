package _8字符串转换整数atoi;

public class Solution {
    public static void main(String[] args) {

//        System.out.println(myAtoi("   -42SAD"));
//        System.out.println(myAtoi("4193 with words"));
//        System.out.println(myAtoi("-91283472332"));
//        System.out.println(myAtoi("9223372036854775808"));
//        System.out.println(myAtoi("18446744073709551617"));
        System.out.println(myAtoi("+1"));
    }

    public static int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        long count = 0;
        int flag = 1;
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            } else {
                if (s.charAt(i) == '-') {
                    flag = -1;
                    ++i;
                }
                break;
            }
        }

        for (; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
                if (sb.length() >= 10) {
                    return flag > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
        }
        for (int j = 0; j < sb.length(); j++) {
            count = count * 10 + sb.charAt(j)-'0';
            if (count * flag > Integer.MAX_VALUE || count * flag < Integer.MIN_VALUE) {
                return flag > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }

        if (count * flag > Integer.MAX_VALUE || count * flag < Integer.MIN_VALUE) {
            return flag > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return (int) (count * flag);
    }
}
