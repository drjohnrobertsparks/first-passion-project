package org.johnrsparkswar;

import java.util.Collections;
import java.util.List;

public class DeckManager {

    private List<Cards> gameDeck;

    public DeckManager(int numberOfPlayers){
        try {
            int numberOfDecksNeeded;
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

    public void addDeck(int numberOfDecks){
        for (int i = 0; i < numberOfDecks; i++) {

        }
    }


}
