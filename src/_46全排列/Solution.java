package _46全排列;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        permute(new int[]{1,2,3});

    }

    /**
     * result = []
     * def backtrack(路径, 选择列表):
     *     if 满足结束条件:
     *         result.add(路径)
     *         return
     *
     *     for 选择 in 选择列表:
     *         做选择
     *         backtrack(路径, 选择列表)
     *         撤销选择
     * @param nums
     * @return
     */
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> lists = new LinkedList<>();

        backtracking(nums,0,lists);

        System.out.println(lists);
        return lists;
    }

    public static void backtracking(int[] nums,int level,List<List<Integer>> lists){

        if (level==nums.length-1){
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }
            lists.add(temp);
            return;
        }
        for (int i = level; i < nums.length; i++) {
            swap(nums,i,level);
            backtracking(nums,level+1,lists);
            swap(nums,i,level);
        }
    }
    private static void swap(int[] nums, int i, int level) {
        int t=nums[i];
        nums[i]=nums[level];
        nums[level]=t;
    }


}
