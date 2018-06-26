package com.sun.thinking_in_java.chapter04._4_7;

/**
 * @author sun
 * @date 2018/6/26
 */
public class LabledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
            for(;;){
                inner:
                    for(;i<10;i++){
                        System.out.println("i = " + i);
                        if(i == 2){
                            System.out.println("continue");
                            continue;
                        }

                        if(i == 3){
                            System.out.println("break");
                            i++;
                            break;
                        }

                        if(i == 7){
                            System.out.println("continue outer");
                            i++;
                            continue outer;
                        }

                        if(i == 8){
                            System.out.println("break outer");
                            break outer;
                        }


                        for(int k = 0;k < 5;k++){
                            if(k == 3){
                                System.out.println("continue inner");
                                continue inner;
                            }
                        }
                    }

            }
    }

    /**
     * i = 1
     *
     *
     *
     */
}
