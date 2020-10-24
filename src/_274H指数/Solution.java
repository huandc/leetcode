package _274H指数;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{1,2}));
        System.out.println(hIndex(new int[]{3, 0, 6, 1, 5}));
        System.out.println(hIndex(new int[]{0}));
    }
    public static int hIndex(int[] citations) {

        if (citations.length==1&&citations[0]>0) return 1;

        Arrays.sort(citations);//先进行排序
        int h = citations.length;

        for(int i =0;i<citations.length;i++){
            if (citations[i] == citations.length-1-i){
                return citations[i];
            }else if (citations[i]==citations.length-i){
                return citations[i];
            }

        }

        return 0;
    }
}
