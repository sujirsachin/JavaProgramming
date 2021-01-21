package Problems.DeckOPlayingCards;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class DeckOfCards {
    private ArrayList<Cards> cards;
    private static final String[] suits={"Clubs","Diamonds","Hearts","Spades"};
    private static final String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    private int numberOfCards=52;

    public DeckOfCards()
    {
        this.cards=new ArrayList<>();
        initializeCards();
    }

    private void initializeCards()
    {
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
        for(int i=0;i<numberOfCards;i++)
        {
            randomNumber=random.nextInt(numberOfCards);
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

    private void removeCard(int index) {
        int i = index;
        while (i < cards.size() - 1)
        {
            this.cards.set(i,this.cards.get(i + 1));
            i++;
        }
        if (i == cards.size() - 1)
        {
            this.cards.remove(i);
        }
        numberOfCards--;
    }

    public void selectCard()
    {
        Random random=new Random();
        boolean usedIndex=false;
        int randomNumber=random.nextInt(numberOfCards);
        /*if(indexVisited.contains(randomNumber))
        {
            usedIndex=true;
        }
        while(usedIndex==true)
        {
            randomNumber=random.nextInt(numberOfCards);
            if(!indexVisited.contains(randomNumber))
            {
                usedIndex=false;
            }
        } */
        System.out.println(this.cards.get(randomNumber).toString());
        //indexVisited.add(randomNumber);
        removeCard(randomNumber);
    }

    public static void main(String args[])
    {
        DeckOfCards playDeck=new DeckOfCards();
        DeckOfCards playDeck2=new DeckOfCards();
        //playDeck.deal();
        System.out.println("Here");
        for(int i=0;i<52;i++)
        {
            playDeck.selectCard();
            System.out.println("");
        }
        for(int i=0;i<52;i++)
        {
            playDeck2.selectCard();
            System.out.println("");
        }
    }
}
