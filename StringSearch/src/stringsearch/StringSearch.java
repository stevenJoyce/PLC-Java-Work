
package stringsearch;

public class StringSearch {

    public static void main(String[] args) {
        // initialize String array
        String[] books = 
        {
            "Java in easy steps", "XML in easy steps",
            "HTML in easy steps", "CSS in easy steps",
            "Gone With the Wind", "Drop the Defense"
        };
        
        //Create and initialize String array of book titles
        int counter1 = 0, counter2 = 0, counter3=0;
        
        //for loop to iterate through String Array 
        //listing first 4 outputs
        for(int i = 0; i< books.length; i++)
        {
            System.out.print(books[i].substring(0,4)+"|");
         
         if(books[i].endsWith("in easy steps"))counter1++;   
        }//end of for-loop
        
    }//end of main
    
}//end of class
