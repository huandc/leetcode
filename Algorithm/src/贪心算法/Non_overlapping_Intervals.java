package 贪心算法;

import java.util.Arrays;

/**
 * 输入是一个数组，数组由多个长度固定为 2 的数组组成，表示区间的开始和结尾。输出一个
 * 整数，表示需要移除的区间数量。
 * Input: [[1,2], [2,4], [1,3]]
 * Output: 1
 * 在这个样例中，我们可以移除区间 [1,3]，使得剩余的区间 [[1,2], [2,4]] 互不重叠。
 */
public class Non_overlapping_Intervals {
    public static void main(String[] args) {
        // System.out.println(eraseOverlapIntervals(new int[][]{{1, 2}, {2, 4}, {1, 3}}));

        System.out.println(eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));

        System.out.println(eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {

        int count = 0;
        if (intervals.length == 0) return 0;

        //排序
        Arrays.sort(intervals, (int[] nums_a, int[] nums_b) -> {
            return nums_a[1] - nums_b[1];
        });

        int pre = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < pre) {
                count++;
            } else {
                pre = intervals[i][1];
            }
        }
        return count;
    }
}
