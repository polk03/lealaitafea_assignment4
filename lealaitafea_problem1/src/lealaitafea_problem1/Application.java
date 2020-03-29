package lealaitafea_problem1;

 
public class Application 
{

	
   public static void main(String[] args)   {

       DuplicateRemover app = new DuplicateRemover();

       app.remove("problem1.txt");       
       app.write("unique_words.txt");

   }
}
