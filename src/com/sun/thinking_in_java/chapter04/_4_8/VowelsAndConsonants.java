package com.sun.thinking_in_java.chapter04._4_8;

import java.util.Random;

/**
 * @author sun
 * @date 2018/6/26
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for(int i=0;i<100;i++){
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + "," + c + ":");

            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("sometimes a vowel");
                    break;
                default:
                    System.out.println("constant");
            }

        }
    }
}
