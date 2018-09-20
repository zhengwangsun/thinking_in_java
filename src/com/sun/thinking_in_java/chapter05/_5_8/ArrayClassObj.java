package com.sun.thinking_in_java.chapter05._5_8;

import java.util.Arrays;
import java.util.Random;

/**
 * @author sun
 * @date 2018/9/20
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[]  a= new Integer[random.nextInt(20)];
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            a[i] = random.nextInt(500);
        }

        System.out.println(Arrays.toString(a));
    }
}
