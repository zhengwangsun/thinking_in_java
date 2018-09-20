package com.sun.thinking_in_java.chapter05._5_8;

/**
 * @author sun
 * @date 2018/9/20
 */
public class NewVarArgs {
    static void printArray(Object... args){
        for(Object obj: args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray();
        printArray(new Object[]{new Integer(11),new Boolean(true),11});
    }
}
