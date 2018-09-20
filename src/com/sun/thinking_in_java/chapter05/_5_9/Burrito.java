package com.sun.thinking_in_java.chapter05._5_9;

import sun.security.provider.ConfigFile;

/**
 * @author sun
 * @date 2018/9/20
 */
public class Burrito {
    Spiciness degree;
    Burrito(Spiciness spiciness){
        this.degree = spiciness;
    }

    public void describe(){
        System.out.print("This burrito is ");
        switch (degree){
            case NOT:
                System.out.println("nor at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot");
                break;
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
