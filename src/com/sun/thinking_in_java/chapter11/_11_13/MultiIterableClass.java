package com.sun.thinking_in_java.chapter11._11_13;

import java.util.*;

/**
 * @author sun
 * @date 2018/10/14
 */
public class MultiIterableClass extends ArrayList<String> {
    @Override
    public Iterator<String> iterator() {
        return super.iterator();
    }

    public MultiIterableClass(Collection<String> s){
        super(s);
    }

    public Iterable<String> reversed(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = size()-1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return get(current--);
                    }
                };
            }
        };
    }

    public Iterable<String> random(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<>();
                for(int i=0;i<size();i++){
                    shuffled.add(get(i));
                }
                Collections.shuffle(shuffled);
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass(Arrays.asList("a b c d".split(" ")));
        for(String s:mic){
            System.out.print(s + " ");
        }
        System.out.println();

        for(String s:mic.reversed()){
            System.out.print(s + " ");
        }
        System.out.println();


        for(String s:mic.random()){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
