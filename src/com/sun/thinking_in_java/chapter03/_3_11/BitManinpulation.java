package com.sun.thinking_in_java.chapter03._3_11;

import java.util.Random;

/**
 * @author sun
 * @date 2018/6/13
 */
public class BitManinpulation {
    public static void main(String[] args) {
        Random random = new Random(47);
        int i = random.nextInt();
        int j = random.nextInt();

        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);

        int maxpos = 2147483647;
        printBinaryInt("maxpos", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("maxneg", maxneg);
        System.out.println();

        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);

        System.out.println();
        printBinaryInt("i", i);
        printBinaryInt("j", j);
        printBinaryInt("i & j" , i&j);
        printBinaryInt("i | j", i|j);
        printBinaryInt("i ^ j", i^j);

        System.out.println();
        printBinaryInt("i", i);
        printBinaryInt("i<<5", i<<5);
        printBinaryInt("i>>5", i>>5);
        printBinaryInt("i>>>5", i>>>5);



    }

    static void printBinaryInt(String s, int i){
        System.out.println(s + ",int:" + i + ",binary:\n" + Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l){
        System.out.println(s + ",long:" + l + ",binary:\n" + Long.toBinaryString(l));
    }
}
