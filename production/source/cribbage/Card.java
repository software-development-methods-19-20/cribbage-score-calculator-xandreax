package cribbage;

public class Card {

    private Rank rank;
    private Suite suite;

    public Card (Rank rank, Suite suite){
        this.rank = rank;
        this.suite = suite;
    }

    public Rank rank() {
        return rank;
    }

    public Suite suite() {
        return suite;
    }
}
