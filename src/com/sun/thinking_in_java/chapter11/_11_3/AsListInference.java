package com.sun.thinking_in_java.chapter11._11_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author sun
 * @date 2018/10/7
 */
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());
        for(Snow snow:snow1){
            System.out.println(snow);
        }
        System.out.println();

        List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());
        for(Snow snow:snow2){
            System.out.println(snow);
        }

        System.out.println();
        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3,new Light(),new Heavy());
        for(Snow snow:snow3){
            System.out.println(snow);
        }

        System.out.println();
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Heavy());
        for (Snow snow:snow4){
            System.out.println(snow);
        }

    }
}
