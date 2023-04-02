import java.util.Scanner;

/**
 * Write a description of class HighLow here.
 *
 * @author (Eric Robinson)
 * @version (a version number or a date)
 */
public class HighLow
{
    protected int m_gamesPlayed;
    private int m_sumofScores;
    private Deck deck;

    public static void main(String args[]){
        HighLow highlow =new HighLow();
        int count=0;

        highlow.Play();
        //highlow.Play();
        count++;

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
        currentCard=deck.DealACard();
        int totalGames=0;
        int Score=0;

        DisplayCurrentCard(currentCard); 
        guess=GuessPrompt();
        Card NextCard=deck.DealACard(); 
        if(NextCard.GetValue()==currentCard.GetValue()){
            System.out.println("The value is the same as the last card");
            System.out.println("You lose on ties!");                
            PlayAgainPrompt();           
        }
        else if(NextCard.GetValue()>currentCard.GetValue()){
            if(guess=='H'){
                System.out.println("Your prediction was correct");
                totalGames++;
                PlayARound();
            }
            else{
                System.out.println("The prediction was incorrect");
                totalGames++;
                PlayAgainPrompt();                 
            }
        }
        else {
            if(guess=='L'){
                System.out.println("Your prediction was correct");
                totalGames++; 
                PlayARound();
            }
            else{
                System.out.println("The prediction was incorrect");
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

    protected void DisplayCurrentCard(Card card){
        System.out.println("The current card is "+card);
    }

    protected void NextCard(Card card){
        System.out.println("The next card is "+card);
    }

}