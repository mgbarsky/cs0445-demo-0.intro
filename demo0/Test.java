public static void main(String[] args) throws FileNotFoundException{ 
    List<String> words = new ArrayList<String>();
    
    File file = new File(args[0]);
    
    
    //Creating Scanner instance to read File in Java
    Scanner reader = new Scanner(file);
 
    //Reading each word of the file using Scanner class
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
    System.out.println("Naive count in: "+ duration + " ms" );
    
    startTime = System.nanoTime();        
    MostFrequentSmart.count(words);        
    endTime = System.nanoTime();

    duration = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
    System.out.println("Smart count in: "+ duration + " ms" );
}