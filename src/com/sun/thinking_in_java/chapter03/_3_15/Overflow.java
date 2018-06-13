package com.sun.thinking_in_java.chapter03._3_15;

/**
 * @author sun
 * @date 2018/6/13
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big:" + big);
        int bigger = big * 4;
        System.out.println("bigger:" + bigger);
    }
}
