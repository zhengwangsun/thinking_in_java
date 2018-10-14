package com.sun.thinking_in_java.chapter11._11_1;


import java.util.ArrayList;

/**
 * @author sun
 * @date 2018/10/7
 */

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for(Apple apple: apples){
            System.out.println(apple);
        }
    }
}
