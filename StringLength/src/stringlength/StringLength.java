
package stringlength;

public class StringLength {

    public static void main(String[] args) {
        // create and initialize 2 variables
        String lang = "Java";
        String series = " in easy steps";
        
        //add new variable and assign it 
        //the concatenated values of other 2
        String title = lang.concat(series);
        
        //output all variables withe quatation marks
        System.out.print("\"" + title+ "\" has ");
        System.out.println(title.length() + " characters");
        
        
        
        
        
    }//end of main
    
}//end of class
