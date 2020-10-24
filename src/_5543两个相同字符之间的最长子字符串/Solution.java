package _5543两个相同字符之间的最长子字符串;

public class Solution {
    public static void main(String[] args) {

        System.out.println(maxLengthBetweenEqualCharacters("ojdncpvyneq"));
    }
    public static int maxLengthBetweenEqualCharacters(String s) {

        int left=0;
        int max=-1;
        for (int i = 0; i < s.length(); i++) {
            left=i;
            for (int j = s.length()-1; j >i ; j--) {
                if (s.charAt(left)==s.charAt(j)){
                    if(j-left-1>max){
                        max= j-left-1;
                    }

                }
            }
        }


        return max;




    }
}
