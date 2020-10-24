package _7整数反转Integer_reverse;

class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(2147483647));
    }
    public static int reverse(int x1) {

        boolean flag = false;
        long x = (long)x1;
        if (x > 0) {
            flag = false;
        } else {
            x = -x;
            flag= true;
        }
        long n = 0;
        while (x >= 10) {
            n = n * 10;
            n += (x % 10) * 10;
            x = x / 10;
        }
        n += x;

        if (n >= 2147483647 || n < -2147483648) {
            return 0;
        }
        if (flag){
            x1 = (int) -n;
        }else {
            x1 = (int)n;
        }
        return x1;
    }
}
