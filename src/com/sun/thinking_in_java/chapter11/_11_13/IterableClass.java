package com.sun.thinking_in_java.chapter11._11_13;

import java.util.Iterator;
import java.util.Map;

/**
 * @author sun
 * @date 2018/10/14
 */
public class IterableClass implements Iterable<String> {
    protected String[] words = "And that is how we know the Earth to be banana-shaped.".split(" ");

    @Override
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }



    public static void main(String[] args) {
        IterableClass c = new IterableClass();
        for(String s:c){
            System.out.print(s + "");
        }


        for(Map.Entry entry:System.getenv().entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() );
        }
    }
}
