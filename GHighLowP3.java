import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

/**
 * Graphical window for HighLow
 *
 * @author (Prof R)
 * @version (v1.0, 3/23/23)
 */
public class GHighLowP3
{
    private JFrame      frame;
    private JPanel      panel;
    private JLabel      iconLabelOne, iconLabelTwo;
    private ImageIcon   image;

    protected int m_gamesPlayed;
    private int m_sumofScores;
    private Deck deck;


    public GHighLowP3()
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


    public void Play(){
        System.out.println("welcome");
        PlayARound();
    }

    protected char PlayAgainPrompt(){
        char answer;
        Scanner in=new Scanner(System.in);
        System.out.println("Would you like to play again? Y/N");
        answer=in.next().charAt(0);
        int count=0;
        boolean counterTF=true;
        while(counterTF==true){
            count++;   
            if(answer=='Y'){
                PlayARound();                   
            }
            else{
                System.out.println("The total games played was "+count);
                counterTF=false;
                break;
            }

        }
        return answer;
    }

    protected int PlayARound(){
        char guess;
        deck=new Deck();
        deck.Shuffle();
        Card currentCard;
        this.image  = new ImageIcon("cards//cardBack.png");
        this.iconLabelTwo.setIcon(this.image);     
        currentCard=deck.DealACard();

        int totalGames=0;
        int Score=0;

        DisplayCurrentCard(); 
        guess=GuessPrompt();
        Card NextCard=deck.DealACard(); 
        if(NextCard.GetValue()==currentCard.GetValue()){
            System.out.println("The value is the same as the last card");
            System.out.println("You lose on ties!");  
            DisplayNextCard();
            totalGames++;
            PlayAgainPrompt();           
        }
        else if(NextCard.GetValue()>currentCard.GetValue()){
            if(guess=='H'){
                System.out.println("Your prediction was correct");
                DisplayNextCard();
                totalGames++;
                PlayAgainPrompt();
            }
            else{
                System.out.println("The prediction was incorrect");
                DisplayNextCard();
                totalGames++;
                PlayAgainPrompt();                 
            }
        }
        else {
            if(guess=='L'){
                System.out.println("Your prediction was correct");
                DisplayNextCard();
                totalGames++; 
                PlayAgainPrompt();
            }
            else{
                System.out.println("The prediction was incorrect");
                DisplayNextCard();
                totalGames++;
                PlayAgainPrompt();                                    
            }
        }
        currentCard=NextCard;        
        this.m_gamesPlayed=totalGames;
        return this.m_gamesPlayed;
    }


    protected char GuessPrompt(){
        char prompt;
        Scanner in=new Scanner(System.in);
        System.out.println("Will the next card be higher (H) or lower (L)?");
        prompt=in.next().charAt(0);
        return prompt;
    }


    protected void DisplayCurrentCard() {
        this.iconLabelOne.setIcon(deck.GetImage());
    }
    protected void DisplayNextCard() {
        this.iconLabelTwo.setIcon(deck.GetNextImage());
    }

}
