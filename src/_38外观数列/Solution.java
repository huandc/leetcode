package _38外观数列;

public class Solution {
    public static void main(String[] args) {
        countAndSay(4);
    }

    public static String countAndSay(int n) {



        StringBuilder str = new StringBuilder("1");
        String res = str.toString();
        int count=0;
        char temp;
        int i,j;
        for (i = 1; i < n; i++) {
            temp=res.charAt(0);
            res = str.toString();
            str=new StringBuilder();
            for (j = 0; j < res.length(); j++) {
                if (res.charAt(j)==temp){
                    count++;
                }else if(res.charAt(j)!=temp) {
                    str.append(count);
                    str.append(temp);
                    count=0;
                    temp=res.charAt(j);
                    j--;
                }
            }
            if(count>0 && j+1>=res.length()) {
                str.append(count);
                str.append(temp);
                count=0;
            }


            res=str.toString();

        }


        System.out.println(res);

        return str.toString();
    }
}
