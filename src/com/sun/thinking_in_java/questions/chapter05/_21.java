package com.sun.thinking_in_java.questions.chapter05;

/**
 * @author sun
 * @date 2018/9/20
 */
public class _21 {
    public enum Bills{
        ONE,FIVE,TEN,TWENTY,FIFTY,HUNDRED
    }

    public static void main(String[] args) {
        for(Bills b: Bills.values()){
            System.out.println(b + ":" + b.ordinal());
        }
    }
}
