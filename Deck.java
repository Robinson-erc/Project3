
/**
 * Write a description of class Deck here.
 *
 * @author (Eric Robinson)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import java.util.Collections;
 
public class Deck
{
   public static final int NCARDS = 52;
    //private Card[] NewDeck = new Card[NCARDS];
    private ArrayList <GCardP3> NewDeck = new ArrayList <GCardP3>(); 
    private List<GCardP3>   deck;
    private int cardsUsed = 0;
    private final int SHUFFLENUM=1000;
    // private RandomInteger   r1; 
    // private RandomInteger   r2;
    
    public Deck(){
        // r1=new RandomInteger(0,NCARDS-1);
        // r2=new RandomInteger(0,NCARDS-1);
       String[] s1 = {"SPADES", "HEARTS", "DIAMONDS", "CLUBS"};
       String s2=null;
       deck = new ArrayList<>();

       for (int value =1; value <=13; value++){
           for(int s=0; s<4;s++){
               s2 = "cards//" + String.valueOf(value) + s1[s] + ".png";
               deck.add(new GCardP3(value, Card.Suit.values()[s],s2));
           }
       }
    }
    public int CardsLeft(){
        return NCARDS - cardsUsed;
    }
    public GCardP3 DealACard(){
        cardsUsed++;
        return deck.get((cardsUsed-1)); 
    }
   
    public ImageIcon GetImage() {
        return deck.get(cardsUsed - 1).GetImageIcon();
    }

    public ImageIcon GetNextImage() {
        return deck.get(cardsUsed - 1).GetImageIcon();
    }

    public void Shuffle(){
        for(int i= deck.size()-1; i >0;  i--){
            int rand = (int) (Math.random()*(i+1));
            Card temp = deck.get(i);
            Collections.shuffle(deck);
        } 
        cardsUsed=0;
    }
}
