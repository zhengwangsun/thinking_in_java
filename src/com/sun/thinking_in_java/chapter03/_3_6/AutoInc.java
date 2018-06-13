package com.sun.thinking_in_java.chapter03._3_6;


/**
 * @author sun
 * @date 2018/6/13
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i :" + i);
        System.out.println("++i :" + ++i);
        System.out.println("i :" + i);
        System.out.println("i++ :" + i++);
        System.out.println("i :" + i);

        System.out.println("--i :" + --i);
        System.out.println("i :" + i);
        System.out.println("i-- :" + i--);
        System.out.println("i :" + i);
    }
}
