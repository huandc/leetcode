package _150逆波兰表达式求值;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

        String[] ts ={"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(ts));
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        System.out.println(evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
        System.out.println(evalRPN(new String[]{"5","6","3","+","*","3","/","1","-"}));


    }
    public static int evalRPN(String[] tokens) {

        Stack<Integer> nums = new Stack<>();
        Stack<Character> opers = new Stack<>();

        String temp;
        int t1; // 弹出栈第一个元素
//        int t2; //弹出栈第二个元素
        for (int i = 0; i < tokens.length; i++) {
            temp= tokens[i];
            //当算术运算符时 弹出两个数 进行运算 t2 运算符t1
            if (temp.equals("+")){
                if (nums.empty()) {
                    opers.push(temp.toCharArray()[0]);
                    continue;
                }
                // 计算后结果继续入栈
                nums.push(nums.pop()+nums.pop());
            }else if (temp.equals("-")){
                if (nums.empty()) {
                    opers.push(temp.toCharArray()[0]);
                    continue;
                }
                t1 = nums.pop();
//                t2 = nums.pop();
                nums.push(nums.pop()-t1);
            }else if (temp.equals("*")){
                if (nums.empty()) {
                    opers.push(temp.toCharArray()[0]);
                    continue;
                }
                nums.push(nums.pop()*nums.pop());
            }else if (temp.equals("/")){
                if (nums.empty()) {
                    opers.push(temp.toCharArray()[0]);
                    continue;
                }
                t1 = nums.pop();
//                t2 = nums.pop();
                nums.push(nums.pop()/t1);
            }else {
                nums.push(Integer.parseInt(temp));
            }
        }

        return nums.pop();
    }

}
