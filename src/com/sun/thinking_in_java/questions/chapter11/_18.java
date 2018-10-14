package com.sun.thinking_in_java.questions.chapter11;

import java.util.*;

/**
 * @author sun
 * @date 2018/10/10
 */
public class _18 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","111");
        map.put("2","222");
        map.put("3","333");
        map.put("4","444");

        System.out.println(map + "\n");

        Set<String> sortKeys = new TreeSet<>(map.keySet());
        Map<String,String> map1 = new LinkedHashMap<>();
        for(String key:sortKeys){
            map1.put(key, map.get(key));
        }

        System.out.println();
        System.out.println(map1);
        System.out.println();
    }
}
