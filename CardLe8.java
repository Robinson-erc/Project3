
/**
 * Card class
 *
 * @author (Prof R)
 * @version (v1.0 01/09/23)
 */
public class CardLe8 {
    public enum Suit {SPADES, HEARTS, DIAMONDS, CLUBS};

    public final static int ACE = 1;    // static final data member, global to all objects
    public final static int JACK = 11;  // static final data member, global to all objects  
    public final static int QUEEN = 12; // static final data member, global to all objects  
    public final static int KING = 13;  // static final data member, global to all objects

    private final Suit suit; // final suit, the suit of a card can not change
    private final int value; // final value, the value of the card can not change

    /**
     * Card parametic constructor
     *
     * @param  int theValue, given value
     *         Suit theSuit, given Suit
     * @return 
     */
    public CardLe8(int theValue, Suit theSuit) {
        value = theValue;
        suit = theSuit;
    }


    /**
     * Suit getSuit() - Returns the suit of this card.
     * 
     * @param - none
     * @returns the suit, which is one of the enums Suit.SPADES, 
     *          Suit.HEARTS, Suit.DIAMONDS, Suit.CLUBS
     */
    public Suit getSuit() 
    {
        return suit;
    }

    /**
     * int getValue() - returns the value of this card.
     * 
     * @param - none
     * @return the value, which is one the numbers 1 through 13, inclusive for
     *         a regular card.  Ace could possibly be a special case
     */
    public int getValue() 
    {
        return value;
    }

    /**
     * String getSuitAsString() - returns a String representation of the card's suit.
     * 
     * @param - none
     * @return one of the strings "Spades", "Hearts", "Diamonds", or "Clubs"
     */
    public String getSuitAsString() {
        switch (suit) {
            case SPADES:   
                return "Spades";
            case HEARTS:   
                return "Hearts";
            case DIAMONDS: 
                return "Diamonds";
            default:    
                return "Clubs";
        }
    }

    /**
     * String getValueAsString() - returns a String representation of the card's value.
     * 
     * @param - none
     * @return for a regular card, one of the strings "Ace", "2",
     *         "3", ..., "10", "Jack", "Queen", or "King".  
     */
    public String getValueAsString() 
    {
        switch (value) {
            case 1:   return "Ace";
            case 2:   return "2";
            case 3:   return "3";
            case 4:   return "4";
            case 5:   return "5";
            case 6:   return "6";
            case 7:   return "7";
            case 8:   return "8";
            case 9:   return "9";
            case 10:  return "10";
            case 11:  return "Jack";
            case 12:  return "Queen";
            default:  return "King";
        }
    }

    /**
     * String toString() - returns a string representation of this card, including both
     *                     its suit and its value  Sample return values
     *                     are: "Queen of Hearts", "10 of Diamonds", "Ace of Spades"
     *  @param - none
     *  @return - string - the card represented as a string
     */
    @Override
    public String toString() 
    {
        return getValueAsString() + " of " + getSuitAsString();
    }

    /**
     *  void Display - using System.out.print(toString) this method displays the card as a String without going to the next line
     *  
     *  @param - none
     *  @return - none
     */
    public void Display()
    {
        System.out.print(this.toString());
    }
}