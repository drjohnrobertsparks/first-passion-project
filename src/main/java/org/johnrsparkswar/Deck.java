package org.johnrsparkswar;
import java.util.ArrayList;
import java.util.List;

public class Deck {
    private int numberOfDecksNeeded;

    private int numberOfPlayers;

    private List<Cards> newDeck;

    public Deck(){
        newDeck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits){
            for (String rank : ranks){
                newDeck.add(new Cards(suit, rank));
            }
        }
    }


    public DeckManager(int numberOfPlayers){
        try {
            if (numberOfPlayers >= 1 && numberOfPlayers <= 2){
                numberOfDecksNeeded = 3;
            } else if (numberOfPlayers >= 3 && numberOfPlayers <= 4){
                numberOfDecksNeeded = 6;
            } else if (numberOfPlayers >= 5 && numberOfPlayers <= 6){
                numberOfDecksNeeded = 9;
            } else if (numberOfPlayers >= 7 && numberOfPlayers <= 8){
                numberOfDecksNeeded = 12;
            } else if (numberOfPlayers >= 9 && numberOfPlayers <= 10){
                numberOfDecksNeeded = 15;
            } else {
                numberOfDecksNeeded = 0;
            }
        } catch (NumberFormatException e){
            System.out.println("Sorry, number of players must be between 1 and 10.");
        }
    }
    public int getNumberOfDecksNeeded(){
        return numberOfDecksNeeded;
    }


}
