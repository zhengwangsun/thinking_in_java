package com.sun.thinking_in_java.questions.chapter05;

/**
 * @author sun
 * @date 2018/9/18
 */
public class _6 {
    static class Dog{
        Dog(){}
        Dog(int i,float f){
            System.out.println("int");
        }
        Dog(float f,int i){
            System.out.println("float");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog(1,2.0f);
        Dog dog1 = new Dog(1.0f,2);
    }
}
