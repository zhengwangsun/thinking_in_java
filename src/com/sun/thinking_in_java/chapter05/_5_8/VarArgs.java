package com.sun.thinking_in_java.chapter05._5_8;

/**
 * @author sun
 * @date 2018/9/20
 */
class A{}

public class VarArgs {
    static void printArray(Object[] args){
        for(Object obj: args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(47),new Double(13.0),12});
        printArray(new Object[]{"one","two"});
        printArray(new Object[]{new A(),new A()});
    }
}
