package _853车队;

public class Solution {
    public static void main(String[] args) {

        int[] position = new int[]{1,5,5,5,3,7,6,8,9,5,1,1,4,1,2,5,1,1,4,9,8};
        int[] speed = new int[]{2,3,1,2,1,4,7,4,1,2,5,1,6,2,1,2,5,4,1,2,5};
        carFleet(20,position,speed);
    }

    public static int carFleet(int target, int[] position, int[] speed) {

        if (position.length<=0)return position.length;

        double[] time = new double[position.length];

        for (int i = 0; i < position.length; i++) {
            for (int j = 0; j < speed.length-1-i ; j++) {
                if (position[j] <= position[j + 1]) {
                    swap(position,speed,j,j+1);
                }
            }
        }


        int num = 1;
        double max=time[0];
        for (int i = 0; i < time.length; i++) {
            time[i]=(double)(target-position[i]+0.0)/speed[i];
        }
        for (int i = 1; i < time.length; i++) {
            if (time[i]>max) {
                ++num;
                max=time[i];
            }
        }


        System.out.println(num);
        return num;
    }

    private static void swap(int[] position, int[] speed, int i, int j) {
        int temp = position[i];
        position[i] = position[j];
        position[j] = temp;

        temp = speed[i];
        speed[i] = speed[j];
        speed[j] = temp;
    }

}
