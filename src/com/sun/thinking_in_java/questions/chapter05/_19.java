package com.sun.thinking_in_java.questions.chapter05;

/**
 * @author sun
 * @date 2018/9/20
 */
public class _19 {
    void print(String... args){
        for(String s : args){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        _19 a = new _19();
        a.print("1","2");
        a.print(new String[]{"1","2"});
    }
}
