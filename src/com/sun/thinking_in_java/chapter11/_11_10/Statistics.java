package com.sun.thinking_in_java.chapter11._11_10;

import java.util.HashMap;
import java.util.Random;
import java.util.Map;

/**
 * @author sun
 * @date 2018/10/10
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<100000;i++){
            int r = random.nextInt(10);
//            if(map.containsKey(r)){
//                map.put(r, map.get(r)+1);
//            }else {
//                map.put(r,1);
//            }

            Integer freq = map.get(r) ;
            map.put(r, freq==null ? 1 : freq+1);
        }

        System.out.println(map);
    }
}
