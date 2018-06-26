package com.sun.thinking_in_java.chapter04._4_4;

/**
 * @author sun
 * @date 2018/6/26
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(i == 74){
                break;
            }

            if(i%9 != 0){
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();
        int i = 0;
        while (true){
            i++;
            int j = i * 27;
            if(j == 1269){
                break;
            }

            if(i % 10 != 0){
                continue;
            }

            System.out.print(i + " ");
        }

        i = 0;
        for(;;){
            i ++;
            if(i > 4){
                break;
            }
            System.out.print(i + " ");
        }
    }
}
