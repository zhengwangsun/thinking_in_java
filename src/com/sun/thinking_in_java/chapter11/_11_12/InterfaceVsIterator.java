package com.sun.thinking_in_java.chapter11._11_12;

import java.util.*;

/**
 * @author sun
 * @date 2018/10/14
 */
public class InterfaceVsIterator {
    public static void display(Iterator<String> it){
        while (it.hasNext()){
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void display(Collection<String> collection){
        for(String s:collection){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","bb","cc","dd");
        Set<String> set = new HashSet<String>(Arrays.asList("aa","bb","cc"));

        Map<String,String> map = new HashMap<>();
        map.put("a","aa");
        map.put("b","bb");

        display(list);
        display(list.iterator());
        display(set);
        display(set.iterator());
        display(map.keySet());

        System.out.println(map);
        display(map.keySet());
        display(map.values());
        display(map.values().iterator());

    }
}
