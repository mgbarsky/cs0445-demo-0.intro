package demo0;
import java.util.*;
import java.io.*;

/*
 * MostFrequent.java
 * Author: MBarsky
 * Fall 2025
 * Finds the word with max frequency by scanning list of words
 */
public class MostFrequent {
    public static void count(List<String> allWords) {           
        int maxCount = 0;
        String maxWord = null;
        
        for(int i=0; i < allWords.size(); i++) {
            String currentWord = allWords.get(i);
            int count = 1;
            
            for(int j=i+1; j < allWords.size(); j++) {
                String w = allWords.get(j);
                if (w.equals(currentWord)) {
                    count ++;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                maxWord = currentWord;
            }    
        }
        
        System.out.println("\nCounting using two loops over list");
        System.out.println("The most frequent word is '"+maxWord+"' which occurs "+maxCount+" times.");  
    }
}
