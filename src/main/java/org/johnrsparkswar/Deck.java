package org.johnrsparkswar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> newDeck;

    public Deck(){
        newDeck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits){
            for (String rank : ranks){
                newDeck.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(newDeck);
    }

    public List<Card> getNewDeck(){
        return newDeck;
    }




}
