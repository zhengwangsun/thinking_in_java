package com.sun.thinking_in_java.chapter11._11_1;

import java.util.ArrayList;

/**
 * @author sun
 * @date 2018/10/7
 */
class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}

class Orange{

}

public class ApplesAndOrangesWithoutGenerics {
    public static void main(String[] args) {
//        ArrayList apples = new ArrayList();
//        for(int i=0;i<3;i++){
//            apples.add(new Apple());
//        }
//
//        apples.add(new Orange());
//
//        for(int i=0;i<apples.size();i++){
//            long id = ((Apple)apples.get(i)).id();
//            System.out.println(id);
//        }

        ArrayList<Apple> apples = new ArrayList<>();
        for(int i=0;i<3;i++){
            apples.add(new Apple());
        }

        //compile error
        //apples.add(new Orange());

        for(int i=0;i<apples.size();i++){
            System.out.println(apples.get(i).id());
        }
    }
}
