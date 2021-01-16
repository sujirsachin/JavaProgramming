package Problems.DeckOPlayingCards;

public class Cards {
    private String Suit;
    private String Rank;
    public Cards(String Suit, String Rank)
    {
        this.Rank=Rank;
        this.Suit=Suit;
    }
    public void setRank(String card) {
        Rank = Rank;
    }

    public String getRank() {
        return Rank;
    }

    public void setSuit(String suit) {
        Suit = suit;
    }

    public String getSuit() {
        return Suit;
    }

    @Override
    public String toString() {
        return getRank()+" of "+getSuit();
    }
}
