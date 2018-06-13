package com.sun.thinking_in_java.chapter03._3_7;

/**
 * @author sun
 * @date 2018/6/13
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);

        System.out.println(n1.equals(n2));
    }
}
