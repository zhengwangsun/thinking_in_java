package com.sun.thinking_in_java.chapter03._3_11;


/**
 * @author sun
 * @date 2018/6/13
 */
public class URShift {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println();


        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.bitCount(i));

        i>>>=10;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
        System.out.println();


        long l = -1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));
        System.out.println();

        //无符号右移位 结果不一样
        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));
        System.out.println();

        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        b >>>=10;
        System.out.println(Integer.toBinaryString(b));

    }
}
