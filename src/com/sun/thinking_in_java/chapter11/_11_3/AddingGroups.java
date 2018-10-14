package com.sun.thinking_in_java.chapter11._11_3;

import java.util.*;

/**
 * @author sun
 * @date 2018/10/7
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);

        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1,99);

        for(Integer i:collection){
            System.out.println(i);
        }

        System.out.println("---");

        for(Integer i:list){
            System.out.println(i);
        }
    }
}
