
package Labels;
import javax.swing.*;

public class Labels extends JFrame {
//Create a JPanel conatiner object
JPanel pnl = new JPanel();

//Create an ImageIcon object
ImageIcon duke = new ImageIcon("duke.png");

//Create the 3 JLabel objects to display an image, text or both
JLabel lbl1 = new JLabel( duke );
JLabel lbl2 = new JLabel("Duke is the friendly mascot of technology.");
JLabel lbl3 = new JLabel("Duke",duke,JLabel.CENTER);

public Labels()
{
    super( "Swing labels" );
    setSize( 500, 200 );
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add( pnl );
    pnl.add( lbl1 );
    pnl.add( lbl2 );
    pnl.add( lbl3 );
    setVisible( true );
    lbl1.setToolTipText("Duke- the Java Mascot");
    lbl3.setHorizontalTextPosition( JLabel.CENTER);
    lbl3.setVerticalTextPosition(JLabel.BOTTOM);
}

    public static void main(String[] args) {
        // Create an instance pf labelss class 
        //gui = Global User Interface
        Labels gui = new Labels();
        
    }//end of main 
}//end of class
