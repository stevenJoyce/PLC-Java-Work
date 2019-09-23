
package textfields;
import javax.swing.*;
//added "extends JFrame" to make class windows a sub class of 
//the JFrame SuperClass. We can then access all its features
public class TextFields extends JFrame {
//Create a JPanel conatiner object
JPanel pnl = new JPanel();

//Create 2 textfields objects
JTextField txt1 = new JTextField( 38 );
JTextField txt2 = new JTextField( "Default Text",38);

//Create a JTextArea object 
JTextArea txtArea = new JTextArea( 5, 37 );

//Add a scroll object to cointain JTextArea
JScrollPane pane = new JScrollPane( txtArea );


//TextFields Constructor
public TextFields()
{
    super( "Swing TextFields" );
    setSize( 500, 200 );
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
   
    //Insert Satements to enable the JTextArea object
    //to wrap at word endings
    txtArea.setLineWrap( true );
    txtArea.setWrapStyleWord( true );
   
    //To always display a vertical Scroll Bar
    pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    
    //Insert 2 statements to add the JTextField 
    //components to the JPanel container
    pnl.add( txt1 );
    pnl.add( txt2 );
    pnl.add( pane );
    
    add( pnl );
    setVisible( true );
}

    public static void main(String[] args) {
        // Create an instance pf TextFields class 
        //gui = Global User Interface
        TextFields gui = new TextFields();
        
    }//end of main
}//end of class

        