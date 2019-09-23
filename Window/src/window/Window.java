
package window;
import javax.swing.*;
//added "extends JFrame" to make class windows a sub class of 
//the JFrame SuperClass. We can then access all its features
public class Window extends JFrame {
//Create a JPanel conatiner object
JPanel pnl = new JPanel();

//Insert a constructor method to specif window requirements
//and add to the JPanel object to the JFrame
public Window()
{
    super( "Swing Window" );
    setSize( 500, 450 );//setter method for windows size
    setDefaultCloseOperation(EXIT_ON_CLOSE);//exits program when window gets closed
    add( pnl );//using "add" puts things into the window 
    setVisible( true );//setter method to show window or not show window
}

    public static void main(String[] args) {
        // Create an instance pf Windows class 
        //gui = Global User Interface
        Window gui = new Window();
        
        
    }//end of main
    
}//end of class
