package _167两数之和II输入有序数组;

public class Sloution {
    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ints[0]+"  "+ints[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            }
            if (numbers[i] + numbers[j] > target) j--;
            if (numbers[i] + numbers[j] < target) i++;
        }
        return null;
    }
}
