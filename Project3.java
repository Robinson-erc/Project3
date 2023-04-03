import java.util.Scanner;

/**
 * Graphical HighLow Game
 *
 * @author (Student Name)
 * @version (v1.0, 3/27/23)
 */
public class Project3
{
    protected int m_gamesPlayed;
    private int m_sumofScores;
    private Deck deck;

   public static void main(String args[]){
       GHighLowP3 game = new GHighLowP3();
       int count=0;
       game.Play();
       count++;
   }

}