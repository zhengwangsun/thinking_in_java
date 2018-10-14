package com.sun.thinking_in_java.chapter11._11_11;

import java.util.*;

/**
 * @author sun
 * @date 2018/10/10
 */
public class QueueDemo {
    public static void printQ(Queue queue){
        while (queue.peek() != null){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Random random = new Random(47);
        for(int i=0;i<10;i++){
            queue.offer(random.nextInt(i+10));
        }

        System.out.println(queue);
        printQ(queue);


        Queue<Character> qc =new LinkedList<>();
        for(char c: "Brontosaurus".toCharArray()){
            qc.offer(c);
        }

        //不推荐
        LinkedList<Character> c = (LinkedList<Character>) qc;

        printQ(qc);

    }
}
