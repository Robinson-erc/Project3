import javax.swing.ImageIcon;

/**
 * Write a description of class GCardP3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GCardP3 extends Card
{
    private ImageIcon image;

    /**
     * Constructor for objects of class GCardP3
     */
    public GCardP3(int theValue, Suit theSuit, String imgFileName)
    {
        super(theValue, theSuit);
        this.image = new ImageIcon(imgFileName);
    }

    public ImageIcon GetImageIcon() {
        return this.image;
    }

}
