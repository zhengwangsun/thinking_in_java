package com.sun.thinking_in_java.chapter04._4_3;

/**
 * @author sun
 * @date 2018/6/26
 */
public class WhileTest {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition()){
            System.out.println("Inside while");
        }

        System.out.println("Exist while");
    }
}
