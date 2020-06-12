/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

public class Player {
    Hand hand;
    Deck deck = Deck.getInstance();
    
    //Creates a player object with an empty hand of cards
    Player() {
        hand = new Hand();
    }

    //Creates a player object with a hand of cards with the specified number of cards.
    public Player(int numOfCards) {
        hand = new Hand();
        for(int i = 0; i<numOfCards; i++) {
            hand.addToHand(deck.drawCard());
        }
    }
    //Player draws card and places it into hand.  Then return the card object.
    public Card drawCardToHand() {
        Card card = deck.drawCard();
        hand.addToHand(card);
        return card;
    }
    
    public Card playFromHand(Card card) {
        Card tempCard = hand.playFromHand(card);
        return tempCard;
    }
    
    public Card discardFromHand(Card card) {
        deck.discardCard(hand.playFromHand(card));
        return card;
    }
    
}
