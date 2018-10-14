package com.sun.thinking_in_java.chapter11._11_8;

import java.util.LinkedList;

/**
 * @author sun
 * @date 2018/10/10
 */
public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T v){
        list.addFirst(v);
    }
    public T pop(){
        return list.removeFirst();
    }
    public T peek(){
        return list.getFirst();
    }

    public boolean empty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return list.toString();
    }


    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for(String s: "This is a test".split(" ")){
            stack.push(s);
        }

        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}
