package com.sun.thinking_in_java.questions.chapter05;

/**
 * @author sun
 * @date 2018/9/18
 */
public class _4 {
    _4(){
        System.out.println("This is construct");
    }
    _4(String s){
        System.out.println("This is:" + s);
    }

    public static void main(String[] args) {
        _4 a = new _4("test");
    }
}
