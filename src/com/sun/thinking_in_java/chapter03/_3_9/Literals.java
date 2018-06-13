package com.sun.thinking_in_java.chapter03._3_9;

/**
 * @author sun
 * @date 2018/6/13
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1:" + Integer.toBinaryString(i1));

        int i2 = 0x2F;
        System.out.println("i2:" + Integer.toBinaryString(i2));

        //i3和i4不一样
        int i3 = 0177;  //127
        //Octal
        System.out.println("i3:" + Integer.toBinaryString(i3));

        int i4 = 177;
        System.out.println("i4:" + Integer.toBinaryString(i4));

        System.out.println("i3:" + i3 + " i4:"+i4);

        char c = 0xffff;
        System.out.println("c:" + Integer.toBinaryString(c));

        byte b = 0x7f;
        System.out.println("b:" + Integer.toBinaryString(b));

        short s = 0x7fff;
        System.out.println("s:" + Integer.toBinaryString(s));

        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;

        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 1d;
        double d2 = 1D;


        //int i5 = 099;
        // error
        //System.out.println(i5);

    }
}
