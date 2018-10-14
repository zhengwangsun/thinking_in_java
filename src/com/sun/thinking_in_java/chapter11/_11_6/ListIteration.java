package com.sun.thinking_in_java.chapter11._11_6;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author sun
 * @date 2018/10/7
 */
public class ListIteration {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","bb","cc");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next() + "," + it.previousIndex() + "," + it.nextIndex());
        }

        System.out.println();
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
