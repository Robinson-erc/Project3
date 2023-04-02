/**
 * Write a description of class GCardLe14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.ImageIcon;
public class GCardLe8 extends CardLe8
{
    // Data Member
    private ImageIcon  image;

    /**
     * CardLe15 parametic constructor
     *
     * @param  int theValue, given value
     *         Suit theSuit, given Suit
     * @return 
     */
    public GCardLe8(int theValue, Suit theSuit, String imgFileName) 
    {
        super(theValue, theSuit);
        image = new ImageIcon(imgFileName);
    }

    /**
     *  void Display - using System.out.print(toString) this method displays the card as a String without going to the next line
     *  
     *  @param - none
     *  @return - none
     */
    @Override
    public void Display()
    {
        System.out.print(this.toString());
        // Display Card image?
    }
}
