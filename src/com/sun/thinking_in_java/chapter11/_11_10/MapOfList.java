package com.sun.thinking_in_java.chapter11._11_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sun
 * @date 2018/10/10
 */
public class MapOfList {
    public static Map<String, List<? extends String>> map = new HashMap<>();
    static{
        map.put("2", Arrays.asList("aa","bb","cc","dd"));
        map.put("1", Arrays.asList("a","b","c","d"));
        map.put("3", Arrays.asList("aaa","bbb","ccc","ddd"));
    }

    public static void main(String[] args) {
        System.out.println("key: " + map.keySet());
        System.out.println("values: " + map.values());

        System.out.println();
        for(String key: map.keySet()){
            System.out.println("key is:" + key);
            System.out.println("    " + map.get(key));
        }
    }
}
