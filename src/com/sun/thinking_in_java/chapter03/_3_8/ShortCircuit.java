package com.sun.thinking_in_java.chapter03._3_8;

/**
 * @author sun
 * @date 2018/6/13
 */
public class ShortCircuit {
    private static boolean test1(int val){
        System.out.println("test1(" + val + ")");
        boolean res = val < 1;
        System.out.println("result:" + res);
        return res;
    }

    static boolean test2(int val){
        System.out.println("test2(" + val + ")");
        boolean res = val < 2;
        System.out.println("result:" + res);
        return res;
    }
    static boolean test3(int val){
        System.out.println("test3(" + val + ")");
        boolean res = val < 3;
        System.out.println("result:" + res);
        return res;
    }


    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        //不会执行到test3

        System.out.println("res is :" + b);
    }
}
