package lealaitafea_problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

 

public class DuplicateCounter 
{

   private Map<String,Integer> wordCounter;

   public void count(String dataFile) 

   {

       String word;

       wordCounter = new HashMap<String,Integer>();

       Scanner sc = null;
	
       try 
       {
		sc = new Scanner(new File(dataFile));
       } 
       catch (FileNotFoundException e) 
       {
		
    	System.out.println("Error");
   	    System.exit(0);
 
       }

   

       while(sc.hasNext())

       {

          word = sc.next();

          if (wordCounter.containsKey(word)) {

            wordCounter.put(word, wordCounter.get(word) + 1); //put for word in Hashmap + word counter

          }

          else { 

                wordCounter.put(word, 1); // singular words in problem2.txt

        }

       }

       sc.close();

   }

   public void write(String outputFile) 

   {


	   {

	    File file;
	    
	    FileWriter fileWriter = null;
	    
	    file = new File(outputFile);

	  

	    if(!file.exists()) 
	    {

	      try 
	      {
			file.createNewFile();
		
	      } 
	      catch (IOException e) 
	      {
	    	e.printStackTrace();  
			
		  }
	      
	    }
	   
	    try 
	    {
			fileWriter = new FileWriter(file);
		} 
	    catch (IOException e) 
	    {
			
	    	System.out.println("Error");
	  	  	System.exit(0);
		}

    for (Map.Entry entry : wordCounter.entrySet()) //output hashmap
    {

    try 
    {
		fileWriter.write(entry.getKey() + " " + entry.getValue()+"\n  ");
	} 
    catch (IOException e) 
    {
    	System.out.println("Error");
   	    System.exit(0);
	}

    }

 

    try 
    {
		fileWriter.close();
	} 
    catch (IOException e) 
    {
    	System.out.println("Error");
   	    System.exit(0);
	}

    System.out.println("Process Finished");

 

	}

   }
}