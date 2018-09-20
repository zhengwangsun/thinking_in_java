package com.sun.thinking_in_java.chapter05._5_8;

import java.util.Arrays;
import java.util.Random;

/**
 * @author sun
 * @date 2018/9/20
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random(47);
        a = new int[random.nextInt(20)];
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
    }
}
