package _233数字1的个数;

public class Solution {

    public static void main(String[] args) {
//        System.out.println("9---" + countDigitOne(9));
//        System.out.println("10---" + countDigitOne(10));
//        System.out.println("20---" + countDigitOne(20));
//        System.out.println("30---" + countDigitOne(30));
//        System.out.println("40---" + countDigitOne(40));
//        System.out.println("50---" + countDigitOne(50));
//        System.out.println("60---" + countDigitOne(60));
//        System.out.println("70---" + countDigitOne(70));
//        System.out.println("99---" + countDigitOne(99));
//        System.out.println("199---" + countDigitOne(199));
//        System.out.println("200---" + countDigitOne(200));
//        System.out.println("300---" + countDigitOne(300));
//        System.out.println("400---" + countDigitOne(400));
//        System.out.println("500---" + countDigitOne(500));
//        System.out.println("600---" + countDigitOne(600));
//        System.out.println("999---" + countDigitOne(999));
//        System.out.println("1999---" + countDigitOne(1999));
//        System.out.println("2000---" + countDigitOne(2000));
//        System.out.println("3000---" + countDigitOne(3000));
//        System.out.println("4000---" + countDigitOne(4000));
//        System.out.println("5000---" + countDigitOne(5000));
//        System.out.println("9999---" + countDigitOne(9999));
//        System.out.println("19999---" + countDigitOne(19999));
//        System.out.println("20000---" + countDigitOne(20000));
//        System.out.println("30000---" + countDigitOne(30000));
//        System.out.println("40000---" + countDigitOne(40000));
//        System.out.println("43671---" + countDigitOne(43671));
//        System.out.println("3333---" + countDigitOne(3333));
        System.out.println("3333---" + countDigitOne(1387));

    }

    public static int countDigitOne(int n) {
        if (n<=0) return 0;
        if (n<10) return 1;
        String s = String.valueOf(n);
        int last = Integer.parseInt(s.substring(1));
        int power = (int)Math.pow(10,s.length()-1);
        int high = s.charAt(0)-'0';//当前字符的ASCII码减去‘0’的ASCII码
        if (high == 1){
            return countDigitOne(last) + countDigitOne(power-1) + last + 1;
        }else {
            return power + high * countDigitOne(power-1) + countDigitOne(last);
        }
    }
}
