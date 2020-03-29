package lealaitafea_problem2;



public class Application 
{

	
	   public static void main(String[] args)   {

	       DuplicateCounter app = new DuplicateCounter();

	       app.count("problem2.txt");       
	       app.write("unique_word_counts.txt");

	   }
	}

