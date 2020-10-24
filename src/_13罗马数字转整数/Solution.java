package _13罗马数字转整数;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        System.out.println(romanToInt("VX"));
    }
    public static int romanToInt(String s) {

        int result=0;
//        Map<Character,Integer> map= new HashMap<>();
//        map.put('I',1);
//        map.put('V',5);
//        map.put('X',10);
//        map.put('L',50);
//        map.put('C',100);
//        map.put('D',500);
//        map.put('M',1000);
//
//        for (int i = 0; i < s.length()-1; i++) {
//            if (map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
//                result+=map.get(s.charAt(i));
//            }else {
//                result+=map.get(s.charAt(i));
//            }
//        }
//        return result+map.get(s.charAt(s.length()-1));


        for (int i = 0; i < s.length()-1; i++) {
            if (get(s.charAt(i))>=get(s.charAt(i+1))){
                result+=get(s.charAt(i));
            }else {
                result-=get(s.charAt(i));
            }
        }
        return result+get(s.charAt(s.length()-1));


    }

    public static int get(char c){
        switch (c){
            case 'I' :return 1;
            case 'V' :return 5;
            case 'X' :return 10;
            case 'L' :return 50;
            case 'C' :return 100;
            case 'D' :return 500;
            case 'M' :return 1000;
        }
        return 0;
    }

}
