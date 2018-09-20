package com.sun.thinking_in_java.questions.chapter04;

import java.util.Random;

/**
 * @author sun
 * @date 2018/6/26
 */
public class _3 {
    public static void main(String[] args) {
        Random random1 = new Random(47);
        Random random2 = new Random(58);

        while (true){
            int x = random1.nextInt(20);
            int y = random2.nextInt(20);
            if(x>y){
                System.out.println(x + " > " + y);
            }else if(x ==y){
                System.out.println(x + " = " + y);
            }else{
                System.out.println(x + " < " + y);
            }
        }
    }
}
