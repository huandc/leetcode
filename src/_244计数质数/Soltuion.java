package _244计数质数;

public class Soltuion {
    public static void main(String[] args) {
        countPrimes(10);
    }
    public static int countPrimes(int n) {

        int count=0;

        boolean[] flag = new boolean[n+1];
        for (int i = 2; i <n; i++) {
            if (!flag[i]){
                count++;
                for (int j = 1; j <= n/i; j++) {
                    flag[i*j]=true;
                }
            }
        }
        System.out.println(count);

        return count;
    }
}
