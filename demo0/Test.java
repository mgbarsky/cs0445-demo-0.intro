package demo0;
import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException{ 
    	// input files:
    	// kipling.txt	33683 words
    	// dickens.txt  92532 words
        List<String> words = new ArrayList<String>();
        
        if (args.length < 1) {
        	System.out.println("To run: Test <text file name>");
        	return;
        }
        
        File file = new File(args[0]);
        
        //Creating Scanner instance to read File in Java
        Scanner reader = new Scanner(file);
    
        //Reading each word of the file 
        //and adding it to the list       
        while(reader.hasNext()){
            String w = reader.next();
            words.add(w);
        }  
        
        reader.close();
        
        System.out.println("The input file contains "+words.size()+" words.");
        
        long startTime = System.nanoTime();
        MostFrequent.count(words);        
        long endTime = System.nanoTime();

        long duration = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
        System.out.println("Naive count finished in: "+ duration + " ms" );
        
        startTime = System.nanoTime();        
        MostFrequentFrequencyList.count(words);        
        endTime = System.nanoTime();

        duration = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
        System.out.println("Built in frequency count finished in: "+ duration + " ms" );
        
        startTime = System.nanoTime();        
        MostFrequentAI.count(words);        
        endTime = System.nanoTime();

        duration = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
        System.out.println("AI-generated count finished in: "+ duration + " ms" );
        
        startTime = System.nanoTime();        
        MostFrequentHash.count(words);        
        endTime = System.nanoTime();

        duration = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
        System.out.println("Hash table count finished in: "+ duration + " ms" );        
    }
}