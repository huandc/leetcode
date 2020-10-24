package _925长按键入;

public class Soultion {
    public static void main(String[] args) {

        System.out.println(isLongPressedName("pyplrz", "ppyypllr"));
        System.out.println(isLongPressedName("plpkoh", "plppkkh"));
        System.out.println(isLongPressedName("xnhtq", "xhhttqq"));
        System.out.println(isLongPressedName("alex", "aaleex"));
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
        System.out.println(isLongPressedName("leelee", "lleeelee"));
        System.out.println(isLongPressedName("laiden", "laiden"));

    }
    public static boolean isLongPressedName(String name, String typed) {

//        if(typed.length()<name.length())return false;

        int count_1=0;
        int count_2=0;

        int i = 0,j=0;
        for (i = 0,j=0; i < name.length()&&j<typed.length(); i++,j++) {
            if (name.charAt(i)!=typed.charAt(j)) return false;
            //统计当前字符出现的次数
            while (i<name.length()-1&&name.charAt(i)==name.charAt(i+1)){
                count_1++;
                i++;
            }
            while (j<typed.length()-1&&typed.charAt(j)==typed.charAt(j+1)){
                count_2++;
                j++;
            }
            //当type中的字符数小于name当前字符数 返回false
            if (count_2<count_1){
                return false;
            }else {
                count_1=0;
                count_2=0;
            }
        }


        return i>=name.length()&&j>typed.length()-1;//边界判断
    }
}
