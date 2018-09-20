package com.sun.thinking_in_java.chapter05._5_5;

/**
 * @author sun
 * @date 2018/9/20
 */
public class Book {
    boolean checkedOut = false;
    Book(boolean checkedOut){
        checkedOut = checkedOut;
    }

    void checkIn(){
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if(checkedOut){
            System.out.println("Error: checked out");
        }
        //super.finalize();
    }

    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
