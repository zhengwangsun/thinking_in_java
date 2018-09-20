package com.sun.thinking_in_java.chapter05._5_4;

/**
 * @author sun
 * @date 2018/9/18
 */
public class PassingThis {
    static class Person{
        public void eat(Apple apple){
            Apple apple1 = apple.getPeeled();
            System.out.println("hhh");
        }
    }

    static class Peeler{
        static Apple peel(Apple apple){
            return apple;
        }
    }

    static class Apple{
        Apple getPeeled(){
            return Peeler.peel(this);
        }
    }

    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
