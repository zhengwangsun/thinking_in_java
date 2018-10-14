package com.sun.thinking_in_java.chapter11._11_9;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author sun
 * @date 2018/10/10
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<10000;i++){
            set.add(random.nextInt(30));
        }

        System.out.println(set);
        System.out.println("size:" + set.size());
    }
}
