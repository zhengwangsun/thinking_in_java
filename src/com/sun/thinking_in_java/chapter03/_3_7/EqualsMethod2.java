package com.sun.thinking_in_java.chapter03._3_7;

/**
 * @author sun
 * @date 2018/6/13
 */
class Value{
    int i;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Value){
            Value tmp = (Value) obj;
            return tmp.i == i;
        }else {
            System.out.println("in here");
            return false;
        }
    }
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();

        v1.i = 1;
        v2.i = 1;

        System.out.println(v1.equals(v2));

        System.out.println(v1.equals(1));
    }
}
