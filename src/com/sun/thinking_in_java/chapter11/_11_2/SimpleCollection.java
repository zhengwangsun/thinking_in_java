package com.sun.thinking_in_java.chapter11._11_2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author sun
 * @date 2018/10/7
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i=0;i<10;i++){
            c.add(i);
        }

        for(Integer i:c){
            System.out.println(i);
        }
    }
}
