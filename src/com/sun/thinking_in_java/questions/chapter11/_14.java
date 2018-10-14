package com.sun.thinking_in_java.questions.chapter11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author sun
 * @date 2018/10/10
 */
public class _14 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ListIterator<Integer> it = list.listIterator();

        int[] a = {1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            it = list.listIterator(list.size()/2);
            it.add(a[i]);
            System.out.println(list);
        }

        System.out.println(list);
    }
}
