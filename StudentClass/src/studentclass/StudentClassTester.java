package studentclass;


public class StudentClassTester {

    public static void main(String[] args) {
        
        //Student 1
        StudentClass Student1 = new StudentClass("Paddy","Portlaoise", 21, 30.0f,true);
        
        //Student 2
        StudentClass Student2 = new StudentClass("Mary","Mountmellick",19,250.0f,true);
        
        //Student3
        StudentClass Student3 = new StudentClass("Fiona","Abbeyleix",25,400.0f,false);
        
        //Output of Student 1
        
        System.out.println(Student1.toString());
        
        //Output of Student 2
       System.out.println(Student2.toString());
       
       //Output of Student3
       System.out.println(Student3.toString());
    
       
    
    
    
    
    }//end of main
    
    
}//end of class
