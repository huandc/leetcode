package _763划分字母区间partitionLabels;

import java.util.*;

/**
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，
 * 同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
 * <p>
 * 输入：S = "ababcbacadefegdehijhklij"
 * 输出：[9,7,8]
 * 解释：
 * 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 * 每个字母最多出现在一个片段中。
 * 像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
 */


/**
 * min 存第一个字符的起始位置
 * max 第一个位置的最后出现位置
 * 遍历后面
 * 当后面元素的起始位置 小于max 时候 :
 *             max 取该元素最后位置和 min 中的最大值 继续遍历
 * 当后面元素的起始位置 大于max 时候
 *             max-min+1 加入到list中
 *             min取当前元素的第一次出现的位置
 *
 */
public class Solution {
    public static void main(String[] args) {

        String s = "ababcbacadefegdehijhklij";
        List<Integer> integerList = partitionLabels(s);
        System.out.println(integerList);
    }

    public static List<Integer> partitionLabels(String S) {

        List<Integer> list = new ArrayList<>();
        Map<Character,int[]> map = new LinkedHashMap<Character, int[]>();
        char[] chars = S.toCharArray();//转换成字符数组
        int[] vas ;
        //字典 = {'字母':[第一个位置,最后一个位置]}
        for (int i = 0; i < chars.length; i++) {
            vas = map.get(chars[i]);
            if (vas==null) {
                map.put(chars[i],new int[]{i,i});
            }else{
                map.put(chars[i],new int[]{vas[0],i});
            }
        }
        //只取二维数组 放到values中
        int[][] values= new int[map.size()][2];

        Iterator<Character> iterator = map.keySet().iterator();
        for (int i = 0;  iterator.hasNext(); i++) {
            values[i] = map.get(iterator.next());
        }

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i][0]+"----"+values[i][1]);
        }



        int min = values[0][0];
        int max = values[0][1];
        for (int i = 1; i < values.length; i++) {
            if (values[i][0]<max){
                max = values[i][1] > max?values[i][1]:max;
            }else{
                list.add(max-min+1);
                min = values[i][0];
                max = values[i][1];
            }
        }
        list.add(max-min+1);



        return list;
    }
}
