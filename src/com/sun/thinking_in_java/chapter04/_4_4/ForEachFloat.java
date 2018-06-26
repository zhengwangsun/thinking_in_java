package com.sun.thinking_in_java.chapter04._4_4;

import java.util.Random;

/**
 * @author sun
 * @date 2018/6/26
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] f = new float[10];
        for(int i=0;i<10;i++){
            f[i] = rand.nextFloat();
        }

        for(float x: f){
            System.out.println(x);
        }
    }
}
