package com.sun.thinking_in_java.chapter11._11_13;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author sun
 * @date 2018/10/14
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> c = new LinkedList<>();
        Collections.addAll(c,"Take the long way home".split(" "));
        for(String s:c){
            System.out.println(s);
        }
    }
}
