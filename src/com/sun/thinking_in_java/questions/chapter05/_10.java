package com.sun.thinking_in_java.questions.chapter05;

/**
 * @author sun
 * @date 2018/9/20
 */

class Book{
    boolean in = false;
    Book(boolean checkedOut){
        in = checkedOut;
    }

    void checkIn(){
        in = true;
    }

    void checkOut(){
        in = true;
    }

    @Override
    protected void finalize() throws Throwable {
        if(in){
            System.out.println("Error: login");
        }
    }
}

public class _10 {
    public static void main(String[] args) {
        new Book(true);
        System.gc();
    }

}
