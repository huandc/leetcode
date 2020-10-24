package _347前K个高频元素;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
//
//        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o2.getValue()-o1.getValue();
//            }
//        });
//
//        int[] res = new int[k];
//        for (int i = 0; i < k; i++) {
//            res[i]=list.get(i).getKey();
//        }
//
//        return res;







        return nums;
    }

}
