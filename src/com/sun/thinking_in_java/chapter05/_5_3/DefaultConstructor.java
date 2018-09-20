package com.sun.thinking_in_java.chapter05._5_3;

/**
 * @author sun
 * @date 2018/9/18
 */

class Bird{
}

class Bird2{
    Bird2(int i){}
    Bird2(double d){}
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird2 bird2 = new Bird2(123);
    }
}
