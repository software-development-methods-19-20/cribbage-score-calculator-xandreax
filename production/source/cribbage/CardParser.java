package cribbage;

public class CardParser {

    public static Card parseCard(String cardAsText) {
        Rank rank = Rank.findRank(cardAsText.substring(0,0));
        Suite suite = Suite.findSuite(cardAsText.substring(1,1));
        return new Card(rank, suite);
    }
}
