/*
 * MostFrequentFrequencyList.java
 * Author: MBarsky
 * Fall 2025
 * Finds the word with max frequency by using built-in method Collections.frequency()
 */

package demo0;

import java.util.List;
import java.util.Collections;

public class MostFrequentFrequencyList {
	public static void count(List<String> allWords) {           
        int maxCount = 0;
        String maxWord = null;
        
        for(int i=0; i < allWords.size(); i++) {
            String currentWord = allWords.get(i);
            int count = Collections.frequency(allWords, currentWord);            
            
            if (count > maxCount) {
                maxCount = count;
                maxWord = currentWord;
            }    
        }
        System.out.println("\nCounting using built-in frequency()");
        System.out.println("The most frequent word is '"+maxWord+"' which occurs "+maxCount+" times.");  
    }
}
