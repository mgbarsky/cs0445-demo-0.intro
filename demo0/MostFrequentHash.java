package demo0;

/*
 * MostFrequentSmart.java
 * Author: Marina Barsky
 * Fall 2025
 * Finds the word with max frequency by using a hash table 
 */

 import java.util.*;

 public class MostFrequentHash {
 
     public static void count (List <String> allWords){
         Map<String, Integer> dictionary = new HashMap<String, Integer>();          
         
         int maxCount = 0;
         String maxWord = null;
         
         for(int i=0; i < allWords.size(); i++) {
             String currentWord = allWords.get(i);
             Integer count = dictionary.getOrDefault(currentWord, 0);
             
             dictionary.put(currentWord, count);
             
             if (count > maxCount) {
                 maxCount = count;
                 maxWord = currentWord;
             }    
         }
         
         System.out.println("\nCounting using hash table (Java Hash Map)");
         System.out.println("The most frequent word is '"+maxWord+"' which occurs "+maxCount+" times.");        
     } 
 }
 