package _695岛屿的最大面积_递归;

import org.omg.CORBA.MARSHAL;

public class Solution {
    public static void main(String[] args) {

    }

    private static int[] direction = new int[]{-1, 0, 1, 0, -1};

    public static int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int max_area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max_area= Math.max(max_area,dfs(grid,i,j));
                }
            }
        }
        return max_area;
    }

    private static int dfs(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;
        return 1 + dfs(grid, r + 1, c) + dfs(grid, r - 1, c) +
                    dfs(grid, r, c + 1) + dfs(grid, r, c - 1);

    }
}
