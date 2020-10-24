package _417太平洋大西洋水流问题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }
    public static int[] direction=new int[]{-1,0,1,0,-1};
    public static <j> List<List<Integer>> pacificAtlantic(int[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        List<List<Integer>> list = new LinkedList<>();
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];



        for (int i = 0; i < m; i++) {
            dfs(matrix, pacific, i, 0);
            dfs(matrix, atlantic, i, n - 1);
        }
        for (int i = 0; i < n; i++) {
            dfs(matrix, pacific, 0, i);
            dfs(matrix, atlantic, m - 1, i);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] == true && atlantic[i][j] == true) {
                    list.add(Arrays.asList(i, j));
                }
            }
        }


        return list;
    }


    private static void dfs(int[][] matrix, boolean[][] can_reach, int r, int c) {
        if (can_reach[r][c]) {
            return;
        }
        can_reach[r][c] = true;
        int x, y;
        for (int i = 0; i < 4; ++i) {
            x = r + direction[i];
            y = c + direction[i + 1];
            if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && matrix[r][c] <= matrix[x][y]) {
                dfs(matrix, can_reach, x, y);
            }
        }


    }
}
