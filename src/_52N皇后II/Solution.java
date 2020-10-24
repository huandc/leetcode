package _52N皇后II;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        totalNQueens(4);
        totalNQueens(7);
        totalNQueens(8);
        totalNQueens(9);
        totalNQueens(10);
    }

    public static void print(boolean[][] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                if (v[i][j] == true)
                    System.out.print(1 + "  ");
                else
                    System.out.print(0 + "  ");
            }
            System.out.println("");
        }

    }


    private static int count = 0;

    public static int totalNQueens(int n) {
        count=0;
        boolean[][] visited = new boolean[n][n];
        backstack(visited, 0);

        System.out.println(count);
        return count;
    }

    public static void backstack(boolean[][] visited, int row) {

        if (row == visited.length) {
            count++;
            return;
        }

        for (int col = 0; col < visited.length; col++) {
            if (visited[row][col]) {
                continue;
            }
            boolean[][] temp = new boolean[visited.length][visited.length];
            for (int i = 0; i < visited.length; i++) {
                temp[i]=visited[i].clone();
            }
            visited[row][col]=true;
            visit(visited, row, col);

            backstack(visited, row + 1);

            visited[row][col]=false;
            for (int i = 0; i < temp.length; i++) {
                visited[i]=temp[i].clone();
            }
        }

    }


    public static void visit(boolean[][] visited, int r, int c) {
        int len = visited.length;
        for (int i = 0; i < len; i++) {
            visited[i][c] = true;
            visited[r][i] = true;
        }
        int x = r, y = c;
        while (x >= 0 && y >= 0) {
            visited[x--][y--] = true;
        }
        x = r;
        y = c;
        while (x < len && y < len) {
            visited[x++][y++] = true;
        }
        x = r;
        y = c;
        while (x < len && y >= 0) {
            visited[x++][y--] = true;
        }
        x = r;
        y = c;
        while (x >= 0 && y < len) {
            visited[x--][y++] = true;
        }

    }


}
