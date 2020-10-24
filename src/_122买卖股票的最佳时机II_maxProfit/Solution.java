package _122买卖股票的最佳时机II_maxProfit;

public class Solution {
    public static void main(String[] args) {

        maxProfit(new int[]{7,1,5,3,6,4});
        maxProfit(new int[]{1,2,3,4,5});
        maxProfit(new int[]{7,6,4,3,1});
        maxProfit(new int[]{6, 1, 3, 2, 4, 7});
        maxProfit(new int[]{2,1});
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 1 || prices.length == 0) return prices.length;

        int prof = 0;
        int min = prices[0];
        int i = 1;
        for (i = 1; i < prices.length-1; i++) {
            if (min > prices[i]) min = prices[i];
            if (prices[i] > prices[i + 1]) {
                prof += prices[i]-min;
                min = prices[i+1];
            }
        }
        /*
         1. 给后面设置一个界限
         2. 给min 取第一个值
         3. 开始遍历 当后面值比min 小的时候 min更换值
         4. 当前元素比后一个元素大时候,说明可以卖出
         5. 当前元素减去前面的最小是min
         6. min 等于后面那个元素
         */
        if (prices[i] - min >=0)
            prof += prices[i]-min;

        System.out.println(prof);
        return prof;
    }
}
