package com.sun.thinking_in_java.chapter11._11_7;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author sun
 * @date 2018/10/10
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("aaa","bbb","ccc","ddd"));
        System.out.println(list);

        System.out.println("getFirst: " + list.getFirst());
        System.out.println("getLast: " + list.getLast());

        System.out.println("peek:  " + list.peek());
        System.out.println("remove:  " + list.remove());
        System.out.println(list);

        System.out.println();
        System.out.println("removeFirst:  " + list.removeFirst());
        System.out.println(list);

        System.out.println("poll:  " + list.poll());
        System.out.println(list);
        System.out.println();


        System.out.println("add:  " + list.add("aaa"));
        System.out.println(list);
        list.addFirst("eee");
        System.out.println(list);



    }
}
