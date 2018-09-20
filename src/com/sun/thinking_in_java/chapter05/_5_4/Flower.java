package com.sun.thinking_in_java.chapter05._5_4;


/**
 * @author sun
 * @date 2018/9/20
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petal){
        petalCount = petal;
        System.out.println("Constructor w/ int arg only, petalCount=" + petalCount);
    }

    Flower(String ss){
        s = ss;
        System.out.println("Constructor w/ String arg only, s=" + ss);
    }

    Flower(String s, int petal){
        this(s);
        //this(petal);
        this.petalCount = petal;
        System.out.println("String & int args");
    }

    Flower(){
        this("hi",47);
        System.out.println("Default constructor");
    }



    public static void main(String[] args) {
        Flower x = new Flower();
    }
}
