package _168Excel表列名称;

/**
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 * <p>
 * 例如，
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println((char) 65);
//        System.out.println(convertToTitle(1));
//        System.out.println(convertToTitle(28));
//        System.out.println(convertToTitle(701));
//        System.out.println(convertToTitle(999));
        System.out.println(convertToTitle(52));
    }

    public static String convertToTitle(int n) {

        //(A-65)
        StringBuilder sb = new StringBuilder();
        while (n!=0){
            n--;
            sb.append((char)(65+n%26));
            n/=26;
        }


        return sb.reverse().toString();

    }
}
