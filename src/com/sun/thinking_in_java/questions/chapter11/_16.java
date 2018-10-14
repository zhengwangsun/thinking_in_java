package com.sun.thinking_in_java.questions.chapter11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sun
 * @date 2018/10/10
 */
public class _16 {
    public static void main(String[] args) throws Exception{
        Set<Character> set = new TreeSet<>(
                Arrays.asList('A','E','I','O','U',
                        'a','e','i','o','u'));

        Set<String> words = new TreeSet<>();

        File file = new File("src/com/sun/thinking_in_java/chapter11/_11_9/SetOperator.java");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String s = "\\w+";
        Pattern pattern= Pattern.compile(s);
        String line;
        while ((line = reader.readLine()) != null){
            Matcher ma=pattern.matcher(line);
            while (ma.find()){
                words.add(ma.group());
            }
        }

        int all = 0;
        for(String word: words){
            int count = 0;
            for(Character c:word.toCharArray()){
                if(set.contains(c)){
                    ++count;
                    ++all;
                }
            }
            System.out.println(word + ": " + count);
        }

        System.out.println(all);
    }
}
