package com.sun.thinking_in_java.chapter11._11_12;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * @author sun
 * @date 2018/10/14
 */
public class CollectionSequence extends AbstractCollection<String> {
    private String[] elements = {"1","2","3","4","5","6","7"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < elements.length;
            }

            @Override
            public String next() {
                return elements[index++];
            }
        };
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public int size() {
        return elements.length;
    }


    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();

        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
