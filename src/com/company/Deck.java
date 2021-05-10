package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    String ranks[] = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
    String suits[] = new String[] {"Heart", "Diamond", "Spade", "Club"};
    ArrayList<Card> deck;
    Random rand = new Random();

    /**
     * Constructor
     */
    public Deck(){
        deck = new ArrayList<Card>();
        for(String rank : ranks){
            for(String suite : suits){
                deck.add(new Card(suite, rank));
            }
        }
    }

    /**
     * Function shuffle the deck of card.
     */
    public void shuffle(){

        for(int i = 0; i < 52; i++){
            int randomIdx = rand.nextInt(52) + 1;
            Card temp = deck.get(i);
            deck.set(i, deck.get(randomIdx));
            deck.set(randomIdx, temp);
        }
    }

    /**
    * Function return the top card to be drawn
     */
    public Card drawTopCard(){
        Card drawedCard = deck.get(0);
        deck.remove(0);
        return drawedCard;
    }

    /**
     * Function return the randomly drawn card
     * @return
     */
    public Card randomDraw(){
        int randomIdx = rand.nextInt(52) + 1;
        Card drawnCard = deck.get(randomIdx);
        deck.remove(randomIdx);
        return drawnCard;
    }
    /**
     * Function display the deck of card.
     */
    public void printDeck(){
        for(Card card: deck){
            card.printCard();
        }
    }


}
