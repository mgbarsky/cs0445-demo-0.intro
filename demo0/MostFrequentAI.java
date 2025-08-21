package demo0;

import java.io.*;
import java.util.*;

public class MostFrequentAI {
	public static void count (List <String> allWords) {
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word: allWords) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}     

        // Find the most frequent word
        String mostFrequent = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("\nCounting with AI");
        System.out.println("The most frequent word is '"+ mostFrequent +"' which occurs "+maxCount+" times."); 
    }
}
