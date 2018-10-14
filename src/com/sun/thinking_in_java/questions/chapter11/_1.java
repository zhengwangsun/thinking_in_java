package com.sun.thinking_in_java.questions.chapter11;

import java.util.ArrayList;

/**
 * @author sun
 * @date 2018/10/7
 */
class Gerbil{
    private int gerbilNumber;
    public Gerbil(int i){
        gerbilNumber = i;
    }

    public void hop(){
        System.out.println("Gerbil " + gerbilNumber + " hop");
    }
}
public class _1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for(int i=0;i<10;i++){
            gerbils.add(new Gerbil(i));
        }

        for(Gerbil gerbil:gerbils){
            gerbil.hop();
        }
    }
}
