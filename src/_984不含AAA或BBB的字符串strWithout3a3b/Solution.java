package _984不含AAA或BBB的字符串strWithout3a3b;

class Solution {
    public static void main(String[] args) {
//        System.out.println(strWithout3a3b(1, 2));
//        System.out.println(strWithout3a3b(3, 1));
//        System.out.println(strWithout3a3b(4, 1));
        System.out.println(strWithout3a3b(10, 7));
    }

    public static String strWithout3a3b(int A, int B) {

//        String res = "00";
//        while (A > 0 || B > 0) {
//            while (A > B)
//                if (!str_(res,true).equals("a") || !str_(res,false).equals("a")) {
//                    res += "a";
//                    A--;
//                } else {
//                    if (B > 0) {
//                        if (!str_(res,true).equals("b") || !str_(res,false).equals("b")) {
//                            res += "b";
//                            B--;
//                        } else {
//                            break;
//                        }
//                    }
//                    break;
//                }
//            while (A < B)
//                if (!str_(res,true).equals("b") || !str_(res,false).equals("b")) {
//                    res += "b";
//                    B--;
//                } else {
//                    if (A > 0) {
//                        if (!str_(res,true).equals("a") || !str_(res,false).equals("a")) {
//                            res += "a";
//                            A--;
//                        } else {
//                            break;
//                        }
//                    }
//                    break;
//                }
//
//            if (A == B && A != 0) {
//                if (!str_(res,true).equals("b") || !str_(res,false).equals("b")) {
//                    res += "b";
//                    res += "a";
//                } else {
//                    res += "a";
//                    res += "b";
//                }
//                A--;
//                B--;
//            }
//
//        }
//
//        return res.substring(2);
        if (A == 0 && B == 0) return "";
        int count_a = 0, count_b = 0;
        StringBuilder sb = new StringBuilder();

        while (A > 0 || B > 0) {
            /*
                A>B时候先添加"a"
                B>A时候先添加"b"
                当某个字符够两个则添加另外一个字符
            */
            if (A > B) {
                if (A > 0 && count_a < 2) {
                    count_b = 0;
                    sb.append('a');
                    --A;
                    count_a++;
                } else if (B > 0 && count_b < 2) {
                    count_a = 0;
                    sb.append('b');
                    --B;
                    count_b++;
                }
            } else{
                if (B > 0 && count_b < 2) {
                    count_a = 0;
                    sb.append('b');
                    --B;
                    count_b++;
                } else if (A > 0 && count_a < 2) {
                    count_b = 0;
                    sb.append('a');
                    --A;
                    count_a++;
                }
            }
        }
        return sb.toString();

    }


}
