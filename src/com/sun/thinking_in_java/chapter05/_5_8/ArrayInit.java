package com.sun.thinking_in_java.chapter05._5_8;

import java.util.Arrays;

/**
 * @author sun
 * @date 2018/9/20
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                3,
        };

        Integer b[] = new Integer[]{
                new Integer(1),3
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
