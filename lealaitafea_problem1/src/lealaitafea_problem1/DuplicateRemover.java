package lealaitafea_problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

 

public class DuplicateRemover 
{ 
  
	private Set<String> uniqueWords;

  
	public void remove(String dataFile) 

   {

       String word;
       
       uniqueWords = new HashSet<String>();

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
           uniqueWords.add(word); //add uniqueWords to hashset

       }
       		

   }

  public void write(String outputFile) 

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
    	  System.out.println("Error");
    	  System.exit(0);
		
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

    Iterator<String> iterator = uniqueWords.iterator();

 

    while(iterator.hasNext())

    {

      String singleWord=(String)iterator.next();

      try 
      {
		fileWriter.write(singleWord + " ");
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

 
 
