package com.it.stack;

import java.util.Stack;

/**
 * 使用栈校验括号的匹配
 */
public class StackCheckSign {
    public static void main(String[] args) {

        // 不使用栈，效率较低
        String s = "([{}])";
//        System.out.println(isValid2(s));
        // 使用栈
        System.out.println(isValid(s));
    }

    /**
     * 使用栈
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < len; i++) {
            // 取出字符串中的字符
            char c = s.charAt(i);
            // 如果是左括号字符，入栈
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                // 遇到右括号字符,先判断栈是否为空，如果为空，说明只有右括号字符，无左括号字符，直接返回
                if (stack.isEmpty()) {
                    return false;
                }
                // 弹出栈顶的左括号字符，判断是否与当前的右括号字符'c'匹配
                char left = stack.pop();
                if (left == '{' && c != '}') {
                    return false;
                }
                if (left == '[' && c != ']') {
                    return false;
                }
                if (left == '(' && c != ')') {
                    return false;
                }
            }
        }
        // 若最后栈为空，说明括号是有效的
        return stack.isEmpty();
    }

    /**
     * 巧妙方法，但是效率非常低
     *
     * @param s
     * @return
     */
    public static boolean isValid2(String s) {
        while (s.contains("{}") || s.contains("[]") || s.contains("()")) {
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");
        }
        return s.isEmpty();
    }
}
