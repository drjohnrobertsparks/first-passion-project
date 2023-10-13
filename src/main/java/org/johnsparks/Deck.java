package org.johnsparks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Cards> cards;

    public Deck(){
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits){
            for (String rank : ranks){
                cards.add(new Cards(suit, rank));
            }
        }
    }

}
