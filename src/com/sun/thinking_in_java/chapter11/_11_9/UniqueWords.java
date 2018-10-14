package com.sun.thinking_in_java.chapter11._11_9;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sun
 * @date 2018/10/10
 */
public class UniqueWords {
    public static void main(String[] args) throws Exception{
        Set<String> words = new TreeSet<>();

        File file = new File("src/com/sun/thinking_in_java/chapter11/_11_9/SetOperator.java");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String s = "\\w+";
        Pattern  pattern= Pattern.compile(s);


        String line;
        while ((line = reader.readLine()) != null){
            Matcher ma=pattern.matcher(line);
            while (ma.find()){
                words.add(ma.group());
            }
        }

        System.out.println(words);
    }
}
