package _1002查找常用字符;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        commonChars(new String[]{"bella","lable","roller"});
//        commonChars(new String[]{"cool","lock","cook"});

    }

    public static List<String> commonChars(String[] A) {

//        if (A.length==0) return null;
//        List<String> list = new ArrayList<>();
//        int[] chars = new int[26];
//        int[] temp ;
//        for (int i = 0; i < A[0].toCharArray().length; i++) {
//            ++chars[A[0].toCharArray()[i]-'a'];
//        }
//        for (int i = 1; i < A.length; i++) {
//            temp = new int[26];
//
//            for (int j = 0; j < A[i].toCharArray().length; j++) {
//                ++temp[A[i].toCharArray()[j]-'a'];
//            }
//            for (int k = 0; k < 26; k++) {
//                if (temp[k]>chars[k]){
//                    ;
//                }else if (temp[k] <= chars[k] ){
//                    chars[k]=temp[k];
//                }
//            }
//        }
//        for (int i = 0; i < 26; i++) {
//            for (int j = 0; j < chars[i]; j++) {
//                list.add(String.valueOf((char)(i+'a')));
//            }
//        }
//
//        System.out.println(list);
//        return list;


//        List<String> list = new ArrayList<>();
//        Map<Character,Integer> map = new HashMap<>();
//        Map<Character,Integer> temp = new HashMap<>();
//
//
//        //把第一个字符串 中字母和频率放在map中  {a=1, b=1, e=1, l=2}
//        for (char c : A[0].toCharArray()) {
//            map.put(c,map.getOrDefault(c,0)+1);
//        }
//
//
//        for (String s : A) {
//            temp.clear();
//            for (char c :s.toCharArray()) {
//                temp.put(c,temp.getOrDefault(c,0)+1);
//            }
//
//            for (Character character : map.keySet()) {
//                if (temp.containsKey(character)){
//                    Integer ins = temp.get(character) > map.get(character) ? map.get(character) : temp.get(character);
//                    map.put(character, ins);
//                }else {
//                    map.put(character,0);
//                }
//            }
//        }
//
//        Set<Character> characters = map.keySet();
//        for (Character character : map.keySet()) {
//            for (Integer i = 0; i < map.get(character); i++) {
//                list.add(String.valueOf(character));
//            }
//        }
//
//        System.out.println(list);
//        return list;






        return null;

    }
}
