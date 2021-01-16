package Problems.DeckOPlayingCards;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class DeckOfCards {
    private ArrayList<Cards> cards;
    private String[] suits={"Clubs","Diamonds","Hearts","Spades"};
    private String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    public DeckOfCards()
    {
        this.cards=new ArrayList<>();
        for(int i=0;i<suits.length;i++)
        {
            for(int j=0;j<ranks.length;j++)
            {
                Cards newCard=new Cards(suits[i],ranks[j]);
                this.cards.add(newCard);
            }
        }
    }
    private void shuffleCards()
    {
        ArrayList<Cards> newCards=new ArrayList<>();
        HashSet<Integer> temp=new HashSet<>();
        Random random=new Random();
        int randomNumber;
        for(int i=0;i<52;i++)
        {
            randomNumber=random.nextInt(52);
            if(!temp.contains(randomNumber))
            {
                Cards newCard=new Cards(this.cards.get(randomNumber).getSuit(),this.cards.get(randomNumber).getRank());
                newCards.add(newCard);
                temp.add(randomNumber);
            }
            else
            {
                i--;
            }
        }
        this.cards=newCards;
    }
    public void deal()
    {
        shuffleCards();
        for(int i=0;i<this.cards.size();i++)
        {
            System.out.println(this.cards.get(i).toString());
        }
    }
    public void selectRandom()
    {
        Random random=new Random();
        int randomNumber=random.nextInt(52);
        System.out.println(this.cards.get(randomNumber).toString());
    }
    public static void main(String args[])
    {
        DeckOfCards playDeck=new DeckOfCards();
        playDeck.deal();
        System.out.println("");
        playDeck.selectRandom();
    }
}
