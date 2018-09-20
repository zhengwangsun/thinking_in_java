package com.sun.thinking_in_java.questions.chapter04;

/**
 * @author sun
 * @date 2018/6/26
 */
public class _7 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){

            System.out.println(i);
            if(i == 9){
                break;
            }
        }

        System.out.println();
        for(int i=0;i<=10;i++){
            System.out.println(i);
            if(i == 9){
                return;
            }
        }

        System.out.println("here");
    }
}
