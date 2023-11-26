package org.johnrsparkswar;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WarGame {
    public static void main(String[] args) {
        GameCLI gameCLI = new GameCLI();
        gameCLI.greetMessage();

        Player player1 = gameCLI.initializePlayer();
        Player player2 = gameCLI.initializePlayer();

        Deck deck = new Deck();
        List<Card> currentDeck = new ArrayList<>(deck.getNewDeck());
        Collections.shuffle(currentDeck);

        Card card1 = currentDeck.remove(0);
        Card card2 = currentDeck.remove(0);

        System.out.println(player1.getPlayerName() + " flips: :" + card1.getCardSymbol() + card1.getRank());
        System.out.println(player2.getPlayerName() + " flips: :" + card2.getCardSymbol() + card2.getRank());

        int result = card1.getRank().compareTo(card2.getRank());

        if (result > 0) {
            System.out.println(player1.getPlayerName() + " wins!");
        } else if (result < 0) {
            System.out.println(player2.getPlayerName() + " wins!");
        } else {
            System.out.println("Tie! Time for War!");
        }


    }
}
