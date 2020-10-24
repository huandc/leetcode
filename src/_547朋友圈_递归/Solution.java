package _547朋友圈_递归;

public class Solution {
    public static void main(String[] args) {

    }

    public static int findCircleNum(int[][] M) {

        if (M.length == 0 || M[0].length == 0) return 0;
        int counts = 0;
        boolean[] visited = new boolean[M.length];
        for (int i = 0; i < M.length; i++) {
            if (!visited[i]) {
                dfs(M, i, visited);
                counts++;
            }
        }
        return 0;
    }

    private static void dfs(int[][] m, int i, boolean[] visited) {
        visited[i] = true;
        for (int k = 0; k < m.length; k++) {
            if (m[i][k]==1&&!visited[k]){
                dfs(m,k,visited);
            }
        }
    }
}
