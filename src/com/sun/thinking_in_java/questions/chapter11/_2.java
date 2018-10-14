package com.sun.thinking_in_java.questions.chapter11;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sun
 * @date 2018/10/7
 */
public class _2 {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for (int i=0;i<10;i++){
            c.add(i);
        }

        for(Integer i:c){
            System.out.println(i);
        }

    }
}
