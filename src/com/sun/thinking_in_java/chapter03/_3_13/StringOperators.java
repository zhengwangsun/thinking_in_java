package com.sun.thinking_in_java.chapter03._3_13;

/**
 * @author sun
 * @date 2018/6/13
 */
public class StringOperators {

    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);

        System.out.println(x + s);

        s += "(summed)=";
        System.out.println(s + (x+y+z));
        System.out.println("" + x);
    }
}
