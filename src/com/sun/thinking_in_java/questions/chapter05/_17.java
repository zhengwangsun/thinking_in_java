package com.sun.thinking_in_java.questions.chapter05;

/**
 * @author sun
 * @date 2018/9/20
 */

class Test17{
    Test17(String s){
        System.out.println(s);
    }
}

public class _17 {
    public static void main(String[] args) {
        Test17[] test = new Test17[12];

        for(int i=0;i<test.length;i++){
            test[i] = new Test17("aa");
        }
    }
}
