package _452用最少数量的箭引爆气球findMinArrowShots;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[][] points = new int[][]{};
        points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        findMinArrowShots(points);
        points = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        findMinArrowShots(points);
        points = new int[][]{{1, 9}, {7, 16}, {2, 5}, {7, 12},{9,11},{2,10},{9,16},{3,9},{1,3}};
        findMinArrowShots(points);
    }
/*
        1. 先将数组按照 结束坐标 进行排序
            例如: [[10,16], [2,8], [1,6], [7,12]]----->[[1, 6][2, 8][7, 12][10, 16]]

        2.  max = 第一个数组的 结束坐标
            row = 0  射箭数量
        3. 向后遍历 当 开始坐标小于max 并且 结束坐标 大于 max
                更新max 为 当前max值 和 当前结束坐标中最小的一个
        4. 否则 row++  令max等于当前结束坐标
 */
    public static int findMinArrowShots(int[][] points) {

        if (points.length==0||points.length==1) return points.length;
        //按照 后面那位数字排序
        Arrays.sort(points, (p1, p2) -> {
            return p1[1] - p2[1];
        });

        int row = 0;
        int max = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= max & points[i][1] >= max) {
                if (points[i][1] < max){
                    max = points[i][1];
                }
            } else {
                row++;
                max = points[i][1];
            }
        }
        row++;

        return row;
    }
}
