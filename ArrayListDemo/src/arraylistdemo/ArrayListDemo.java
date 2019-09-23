
package arraylistdemo;
import java.util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) 
    {
      ArrayList<String>countries = new ArrayList<>();
      countries.add("USA");
      countries.add("Eygpt");
      countries.add("Ireland");
      countries.add("South Africa");
      countries.add("Great Britain");
      countries.add("Mexico");
      countries.add("Germany");
      countries.add("Portugal");
      countries.add("Spain");
      
      countries.remove(2);
      countries.remove(4); 
      countries.remove(6);
      //when first country is removed the othe countries moke up one place
      
      if(countries.contains("USA"))
      {
          System.out.println("USA is on the list");
      }//end of if
      
      if(countries.contains("Great Britain"))
      {
          System.out.println("GB is on the list");
      }//end of if
    for(int i=0; i < countries.size(); i++)
    {
        System.out.println(countries.get(i));
    }//end of for-loop
    
    
    
    
    }//end of main
    
}//end of class
