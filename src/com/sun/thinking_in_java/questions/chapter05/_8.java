package com.sun.thinking_in_java.questions.chapter05;

/**
 * @author sun
 * @date 2018/9/18
 */
public class _8 {
    void f1(){
        f2();
        this.f2();
    }

    void f2(){
        System.out.println("f2");
    }

    public static void main(String[] args) {
        _8 a = new _8();
        a.f1();
    }
}
