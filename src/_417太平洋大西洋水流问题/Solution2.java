package _417太平洋大西洋水流问题;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {

    }
    public <j> List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> lists =new LinkedList<>();
        int m = matrix.length-1;
        int n= matrix[0].length-1;
        boolean[][] reach_p = new boolean[m][n];
        boolean[][] reach_a = new boolean[m][n];


        for (int i = 0; i < m; i++) {
            reach_(reach_p,i,0,matrix);
            reach_(reach_a,i,m-1,matrix);
        }
        for (int i = 0; i < n; i++) {
            reach_(reach_p,0,i,matrix);
            reach_(reach_a,n-1,i,matrix);
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (reach_p[i][j]&&reach_a[i][j]){
                    lists.add(Arrays.asList(i,j));
                }
            }
        }

        return lists;
    }
    public static void reach_(boolean[][] reach, int r,int c,int[][] matrix){
        int[] dir= new int[]{-1,0,1,0,-1};
        if (reach[r][c]){
            return;
        }
        reach[r][c]=true;
        int x,y;
        for (int i = 0; i < 4; i++) {
            x=r+dir[i];
            y=c+dir[i+1];
            if (x>=0&&x<matrix.length-1&&y>=0&&x<matrix.length-1&&matrix[x][y]>=matrix[r][c]){
                reach_(reach,x,y,matrix);
            }
        }


    }
}
