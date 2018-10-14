package com.sun.thinking_in_java.chapter11._11_6;

import java.util.*;

/**
 * @author sun
 * @date 2018/10/7
 */
public class CrossContainerIteration {
    public static void display(Iterator<String> it){
        while (it.hasNext()){
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("aa","bb","cc","dd"));
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("aa","bb","cc","dd"));
        HashSet<String> list3 = new HashSet<>(Arrays.asList("aa","bb","cc","dd"));
        TreeSet<String> list4 = new TreeSet<>(Arrays.asList("aa","bb","cc","dd"));

        display(list1.iterator());
        display(list2.iterator());
        display(list3.iterator());
        display(list4.iterator());
    }
}
