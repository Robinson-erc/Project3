
/**
 * Test Deck Driver 
 *
 * @author (Prof R)
 * @version (v1.0, 01/09/23)
 */
public class TestDeckDriver_Lab1
{
    public static void main(String args[])
    {
        Deck deck = new Deck();

        for (int i = 0; i < 52; i++)
        {
            Card card = deck.DealACard();
            System.out.println(card);
        }

        deck.Shuffle();

        System.out.println();
        System.out.println("After Shuffle");
        for (int i = 0; i < 52; i++)
        {
            Card card = deck.DealACard();
            System.out.println(card);
        }
    }
}
