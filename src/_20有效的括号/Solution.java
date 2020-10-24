package _20有效的括号;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

        System.out.println(isValid("(])"));
        System.out.println(isValid("(())"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid(""));

    }

    public static boolean isValid(String s) {
        //用栈 左括号 入栈 右括号 和栈顶比较 正确则弹出栈顶
        // 右括号未完 栈就空 或者不匹配 返回false
        Stack<Character> brackets = new Stack<>();
        char pop;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                brackets.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (brackets.empty()) return false;
                else {
                    pop = brackets.peek();
                    if (c == ')' && pop == '(') {
                        brackets.pop();
                    } else if (c == ']' && pop == '[') {
                        brackets.pop();
                    } else if (c == '}' && pop == '{') {
                        brackets.pop();
                    } else return false;
                }
            }
    }
        return brackets.empty();
    }
}
