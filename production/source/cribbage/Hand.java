package cribbage;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private ArrayList<Card> cardsInTheHand = new ArrayList<>();

    public Hand (String allCardsAsText){
        if(allCardsAsText.length()!=10){
            throw new IllegalArgumentException("Input is not valid");
        }
        List<String> tokens = divideCardsOfHand(allCardsAsText);
        for(String token : tokens) {
            Card card = CardParser.parseCard(token);
            cardsInTheHand.add(card);
        }
    }

    private static List<String> divideCardsOfHand (String cardsInTheHand) {
        List<String> tokens = new ArrayList<>();
        for(int i=0; i<cardsInTheHand.length(); i=i+2){
            tokens.add(cardsInTheHand.substring(i,i+1));
        }
        return tokens;
    }

    public static void main(String[] args) {
        Hand hand = new Hand("5H5H5H5H5H");
        for(int i=0; i<hand.cardsInTheHand.size(); i++) {
            System.out.print(hand.cardsInTheHand.get(i).rank() + " ");
            System.out.println(hand.cardsInTheHand.get(i).suite());
        }
    }
}