package com.sun.thinking_in_java.chapter05._5_2;

/**
 * @author sun
 * @date 2018/7/12
 */
public class OverloadingOrder {
    static void f(String s,int i){
        System.out.println("String:" + s + ", int:" + i);
    }

    static void f(int i, String s){
        System.out.println("int: " + i + " ,String:" + s);
    }


    public static void main(String[] args) {
        f(99, "Int first");
        f("String first", 99);
    }

}
