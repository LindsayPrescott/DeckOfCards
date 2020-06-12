package deckofcards;

import deckofcards.Card.Suit;
import deckofcards.Card.Value;
import java.util.ArrayList;
import java.util.Stack;

public class Deck {
    private static Deck instance = null;
    private ArrayList<Card> deckOfCards = new ArrayList<Card>();
    private Stack<Card> discard;
    
    private Deck() {
        discard = new Stack<Card>();
        for(Suit s : Suit.values()) {
            for(Value v : Value.values()) {
                deckOfCards.add(new Card(s, v));
            }
        }
    }
    
    public static Deck getInstance() {
        if(instance == null) {
            return instance = new Deck();
        }
        else {
            return instance;
        }
    }
    
    public ArrayList<Card> getDeck() {
        return deckOfCards;
    }
    
    public Card drawCard() {
        Card card = deckOfCards.get(0);
        deckOfCards.remove(0);
        return card;
    }
    
    public void shuffleDeck() {
        ArrayList<Card> shuffledDeck = new ArrayList<Card>();
        while (deckOfCards.size() > 0) {
            int index = (int) (Math.random() * deckOfCards.size());
            shuffledDeck.add(deckOfCards.remove(index));
        }
        deckOfCards = shuffledDeck;
    }
    
    public int cardsLeft() {
        return deckOfCards.size();
    }
    
    public void discardCard(Card card) {
        discard.add(card);
    }
}
