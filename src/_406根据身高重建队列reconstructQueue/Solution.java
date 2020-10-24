package _406根据身高重建队列reconstructQueue;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {

        int[][] people = new int[][]{
                {7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}
        };
        int[][] ints = reconstructQueue(people);
        System.out.println(ints.length);
        for (int[] anInt : ints) {
            System.out.print("  "+ anInt[0]+"--"+anInt[1]);
        }

    }

    public static int[][] reconstructQueue(int[][] people) {


        //先将peop 排序
        // h 按照降序排序
        // k 按照升序排序
        // 遍历 排序后的数组，根据K插入到K的位置上
        //高个子先站好位置,矮个子按照k 插到k位置上,前面肯定有k个高个子
        Arrays.sort(people,(p1,p2)->p1[1]-p2[1]);
        Arrays.sort(people,(p1,p2)->p2[0]-p1[0]);
        //  [7,0]  [7,1]  [6,1]  [5,0]  [5,2]  [4,4]

        //插入过程
        // [7,0]
        // [7,0], [7,1]
        // [7,0], [6,1], [7,1]
        // [5,0], [7,0], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [4,4], [7,1]
        for (int[] person : people) {
            System.out.print("["+person[0]+","+person[1]+"]"+"  ");
        }

        LinkedList<int[]> ls = new LinkedList<>();

        for (int[] person : people) {
            ls.add(person[1],person);
        }

        System.out.println(ls.size());
        return ls.toArray(new int[ls.size()][2]);
    }
}
