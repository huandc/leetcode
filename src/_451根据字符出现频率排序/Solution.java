package _451根据字符出现频率排序;

import java.util.*;

public class Solution {
    public static void main(String[] args) {


        frequencySort("tree");
        frequencySort("cccaaa");
        frequencySort("Aabb");
    }
    public static String frequencySort(String s) {

        Map<Character,Integer> map=new HashMap<>();
        //统计频率
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        //排序
        List<Map.Entry<Character,Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        // 重写字符串
        StringBuilder ss= new StringBuilder();
        char c;
        int count;
        for (int i = 0; i < list.size(); i++) {
            c= list.get(i).getKey();
            count=list.get(i).getValue();
            for (int j = 0; j < count; j++) {
                ss.append(c);
            }
        }

        System.out.println(ss);
        return ss.toString();
    }
}
