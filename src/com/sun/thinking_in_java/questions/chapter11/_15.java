package com.sun.thinking_in_java.questions.chapter11;

import com.sun.thinking_in_java.chapter11._11_8.Stack;

/**
 * @author sun
 * @date 2018/10/10
 */
public class _15 {
    public static void main(String[] args) {
        String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s--";

        Stack<Character> stack = new Stack<>();

        int i = 0;
        while( i<s.length()){
            if (s.charAt(i) == '+'){
                stack.push(s.charAt(++i));
            }else if(s.charAt(i) == '-'){
                System.out.print(stack.pop());
            }

            i++;
        }

    }
}
