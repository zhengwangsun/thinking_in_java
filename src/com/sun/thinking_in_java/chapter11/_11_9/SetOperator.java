package com.sun.thinking_in_java.chapter11._11_9;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author sun
 * @date 2018/10/10
 */
public class SetOperator {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"A B C D E F G H I J K L".split(" "));
        set.add("M");

        System.out.println("N: " + set.contains("N"));
        System.out.println("H: " + set.contains("H"));

        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "H I J K L".split(" "));
        System.out.println("set2 in set: " + set.containsAll(set2));

        set.remove("H");
        System.out.println("set2 in set: " + set.containsAll(set2));
        set.removeAll(set2);

        System.out.println("set2 removeAll from set1: " + set);
    }
}
