package _69x的平方根;

public class Solution {
    public static void main(String[] args) {

        System.out.println(mySqrt(1));
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(25));

        System.out.println(mySqrt(1000));
    }

    public static int mySqrt(int x) {

        if (x == 0) return x;
        int left = 1;
        int rigtht = x;
        int mid;
        while (left <= rigtht) {
            mid = (left + rigtht ) / 2;
            if (mid == x / mid) return mid;
            else if (mid < x / mid) left = mid + 1;
            else rigtht = mid - 1;
        }
        return rigtht;

//        //牛顿迭代法
//        long res = x;
//        while (res * res > x) {
//            res=(res+x/res)/2;
//        }
//        return (int) res;
    }
}
