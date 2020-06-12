/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

import java.util.ArrayList;


public class Hand {
    private ArrayList<Card> hand;
    
    Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void addToHand(Card card) {
        hand.add(card);
    }
    
    public Card playFromHand(Card card) {
        if(hand.contains(card)) {
            hand.remove(card);
        }
        else {
            System.out.println("No such card in hand.");
        }
        return card;
    }
    
    public boolean valueMatch(Card card) {
        for(Card tempCard : hand) {
            if(card.getValue() == tempCard.getValue()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        String fullHand = "In your hand you have: /n";
        for(Card card : hand) {
            fullHand+= (card.toString() + "/n");
        }
        return fullHand;
    }
}
