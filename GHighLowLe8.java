import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Graphical window for HighLow
 *
 * @author (Prof R)
 * @version (v1.0, 3/23/23)
 */
public class GHighLowLe8
{
    private JFrame      frame;
    private JPanel      panel;
    private JLabel      iconLabelOne, iconLabelTwo;
    private ImageIcon   image;

    public GHighLowLe8()
    {
        this.frame = new JFrame("High Low");                     // Create frame window and specify window bar text
        this.frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 

        this.image  = new ImageIcon("cards//cardBack.png");

        // Create two icon JLabel objects
        this.iconLabelOne = new JLabel (null, this.image, SwingConstants.CENTER);
        this.iconLabelTwo = new JLabel (null, this.image, SwingConstants.CENTER);

        this.panel = new JPanel();
        this.panel.setBackground(Color.cyan);
        this.panel.setPreferredSize (new Dimension(350, 275));

        this.panel.add(this.iconLabelOne);
        this.panel.add(this.iconLabelTwo);

        //this.iconLabelOne.setIcon(image);
        //this.iconLabelTwo.setIcon(image);

        this.frame.getContentPane().add(this.panel);
        this.frame.pack();
        this.frame.setVisible(true);  
    }

    public void Play()
    {

    }

}
