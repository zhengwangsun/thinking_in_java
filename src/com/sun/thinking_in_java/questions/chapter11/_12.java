package com.sun.thinking_in_java.questions.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author sun
 * @date 2018/10/10
 */
public class _12 {
    public static void main(String[] args) {
        List<Integer>  list1 = Arrays.asList(1,2,3,4,5);
        ListIterator<Integer> it = list1.listIterator();

        List<Integer> list2 = new ArrayList<>();
        ListIterator<Integer> it2  =list2.listIterator();

        while (it.hasNext()){
            it.next();
        }
        while (it.hasPrevious()){
            it2.add(it.previous());
        }

        it2 = list2.listIterator();
        while (it2.hasNext()){
            System.out.print(it2.next() + " ");
        }

        it = list1.listIterator(list1.size());
        while (it.hasPrevious()){
            System.out.print(it.previous() + " ");
        }
    }
}
