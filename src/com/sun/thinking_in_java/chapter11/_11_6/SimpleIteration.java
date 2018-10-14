package com.sun.thinking_in_java.chapter11._11_6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author sun
 * @date 2018/10/7
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d");
        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();

        it = list.iterator();
        for(int i=0;i<3;i++){
            it.next();
            //it.remove();
        }

        System.out.println(list);
    }
}
