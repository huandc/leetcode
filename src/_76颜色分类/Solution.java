package _76颜色分类;

public class Solution {
    public static void main(String[] args) {

        int[] nums=new int[]{2,0,2,1,1,0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num+"  ");;
        }
    }
    public static void sortColors(int[] nums) {

        //遇到0 放左边 遇到2放右边
        //最后left - right放1
        int[] res =nums.clone();
        int left=0,right=res.length-1;
        for (int num : res) {
            if (num==0){
                nums[left++]=num;
            }else if (num==2){
                nums[right--]=num;
            }
        }
        for (int i = left; i <= right; i++) {
            nums[i]=1;
        }
        nums=res.clone();
        System.out.println();
    }
}
