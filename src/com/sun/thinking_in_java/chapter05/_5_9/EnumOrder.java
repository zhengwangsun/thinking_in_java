package com.sun.thinking_in_java.chapter05._5_9;

/**
 * @author sun
 * @date 2018/9/20
 */
public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s :Spiciness.values()){
            System.out.println(s + ":" + s.ordinal());
        }
    }
}
