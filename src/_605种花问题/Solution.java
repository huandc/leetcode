package _605种花问题;

public class Solution {
    public static void main(String[] args) {

        int n;
        int[] flowerbed;
        flowerbed = new int[]{1, 0, 0, 0, 1};
        n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int[] temp = new int[flowerbed.length + 2];
        temp[0] = 0;
        temp[temp.length - 1] = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            temp[i + 1] = flowerbed[i];
        }

        for (int i = 1; i < temp.length - 1; i++) {
            if (temp[i - 1] == 0 && temp[i] == 0 && temp[i + 1] == 0) {
                temp[i] = 1;
                n--;
                if (n == 0) return true;
            }
        }

        return n <= 0;
    }
}
