package deckofcards;

public class Card {
    
    public enum Suit {
        HEARTS, DIAMONDS, SPADES, CLUBS
    }
    
    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    
    final private Suit suit;
    final private Value value;
        
    Card(Suit suit, Value value){
        this.suit = suit;
        this.value = value;
    }
    
    public Value getValue(){
        return value;
    }
    
    public Suit getSuit() {
        return suit;
    }
    
    @Override
    public String toString() {
        return value.toString() + " of " + suit.toString();
    }
}
