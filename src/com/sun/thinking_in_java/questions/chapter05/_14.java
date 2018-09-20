package com.sun.thinking_in_java.questions.chapter05;

/**
 * @author sun
 * @date 2018/9/20
 */
class Test{
    private static String s1 = "s1";
    private static String s2;

    static {
        s2 = "s2";
    }

    public static void test(){
        System.out.println("s1:" + s1 + " s2:" + s2);
    }
}
public class _14 {
    public static void main(String[] args) {
        Test.test();
    }
}
