package _844比较含退格的字符串;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

//        System.out.println(backspaceCompare("ab#c", "ab#c"));
        System.out.println(backspaceCompare("a##c", "#a#c"));
    }

    public static boolean backspaceCompare(String S, String T) {

        /**
         * 使用栈 不是#则进栈 是 # 且 非空 则弹出栈顶
         */
        Stack<Character> stack_s = new Stack<>();
        Stack<Character> stack_t = new Stack<>();
        process(stack_s, S);
        process(stack_t, T);
        while (!stack_s.empty() && !stack_t.empty()) {
            if (stack_s.pop() != stack_t.pop()) {
                return false;
            }
        }
        if (!stack_s.empty() || !stack_t.empty()) {
            return false;
        }

        return true;
    }

    public static void process(Stack<Character> stack, String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else if (s.charAt(i) != '#') {
                stack.push(s.charAt(i));
            }
        }
    }
}
