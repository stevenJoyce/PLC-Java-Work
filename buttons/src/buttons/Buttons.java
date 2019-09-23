
package buttons;
import javax.swing.*;

public class Buttons extends JFrame {
//Create a JPanel conatiner object
JPanel pnl = new JPanel();

//this goes in the PUBLIC CLASS

//create 2 imageIcon objects
    ImageIcon tick = new ImageIcon("tick.png");
    ImageIcon cross = new ImageIcon("cross.png");
    
    //Create 3 JButton objects to display text, an image
    //and both text and an image repectively
    JButton btn = new JButton("Click Me");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton ("STOP" , cross);

//Create a ClassLoader Object    
//ClassLoader Idr = this.getClass().getClassLoader();
//
//Load the URL's of the image resources
//java.net.URL tickURL = Idr.getResource("tick.png");
//java.net.URL crossURL = Idr.getResource("cross.png");

public Buttons()
{
    //CREATE A CONSTRUCTOR
    super(" Swing Buttons" );
    setSize( 500, 200 );
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add( pnl );
    pnl.add( btn );
    pnl.add( tickBtn);
    pnl.add( crossBtn);
    setVisible( true );
    
}

    public static void main(String[] args) {
        // Create an instance pf Buttonss class 
        //gui = Global User Interface
        Buttons gui = new Buttons();
        
        
    }//end of main
    
}//end of class

