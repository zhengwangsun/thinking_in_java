package com.sun.thinking_in_java.questions.chapter05;

/**
 * @author sun
 * @date 2018/9/18
 */

class Dog{
    Dog(){}
    Dog(int i){
        System.out.println("int");
    }
    Dog(float i){
        System.out.println("float");
    }
}
public class _5 {
    public static void main(String[] args) {
        Dog dog=new Dog(1);
        Dog dog1 = new Dog(0.2f);
    }
}
