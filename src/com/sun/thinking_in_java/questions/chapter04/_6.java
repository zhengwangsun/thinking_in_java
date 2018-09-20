package com.sun.thinking_in_java.questions.chapter04;

/**
 * @author sun
 * @date 2018/6/26
 */
public class _6 {
    static boolean test(int k,int begin, int end){
        return k >= begin && k <= end;
    }
    public static void main(String[] args) {
        boolean t = test(10,5,20);
        System.out.println(t);
    }
}
