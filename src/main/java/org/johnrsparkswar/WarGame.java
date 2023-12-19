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

        boolean continuePlaying = true;

        while (continuePlaying && !currentDeck.isEmpty()){
            playRound(player1, player2, currentDeck);
            System.out.print("Deal again? (y/n): ");
            String userInput = gameCLI.getUserInput();
            if(userInput.equalsIgnoreCase("n")){
                continuePlaying = false;
            }
        }
        System.out.println("Quitter! Game over!");
    }

    private static void playRound(Player player1, Player player2, List<Card> currentDeck) {

        Card card1 = currentDeck.remove(0);
        Card card2 = currentDeck.remove(0);

        System.out.println(player1.getPlayerName() + " flips: " + card1.getCardSymbol() + card1.getRank());
        System.out.println(player2.getPlayerName() + " flips: " + card2.getCardSymbol() + card2.getRank());

        int result = Integer.compare(getCardValue(card1.getRank()), getCardValue(card2.getRank()));

        if (result == 0) {
            System.out.println("Tie! Time for War!");

            List<Card> warCardsPlayer1 = new ArrayList<>();
            List<Card> warCardsPlayer2 = new ArrayList<>();

            warCardsPlayer1.add(currentDeck.remove(0));
            warCardsPlayer2.add(currentDeck.remove(0));

            warCardsPlayer1.add(currentDeck.remove(0));
            warCardsPlayer2.add(currentDeck.remove(0));

            Card warCard1 = currentDeck.remove(0);
            Card warCard2 = currentDeck.remove(0);

            warCardsPlayer1.add(warCard1);
            warCardsPlayer2.add(warCard2);

            displayWarCards(player1, warCardsPlayer1);
            displayWarCards(player2, warCardsPlayer2);

            int warResult = Integer.compare(getCardValue(warCard1.getRank()), getCardValue(warCard2.getRank()));

            if (warResult > 0) {
                System.out.println(player1.getPlayerName() + " wins the war!");
            } else if (warResult < 0) {
                System.out.println(player2.getPlayerName() + " wins the war!");
            } else {
                System.out.println("Another tie! Another War! Who will win this battle");
            }

            return;
        }

        if (result > 0) {
            System.out.println(player1.getPlayerName() + " wins!");
        } else {
            System.out.println(player2.getPlayerName() + " wins!");
        }

        while (result == 0 && currentDeck.size() >= 6) {

            currentDeck.remove(0);
            currentDeck.remove(0);
            currentDeck.remove(0);
            currentDeck.remove(0);

            Card warCard1 = currentDeck.remove(0);
            Card warCard2 = currentDeck.remove(0);

            int warResult = Integer.compare(getCardValue(warCard1.getRank()), getCardValue(warCard2.getRank()));

            if (warResult > 0) {
                System.out.println(player1.getPlayerName() + " wins the war!");
            } else if (warResult < 0) {
                System.out.println(player2.getPlayerName() + " wins the war!");
            } else {
                System.out.println("Another tie! Another War! Who will win this battle");
            }
        }

    }

    private static int getCardValue(String rank) {
        try {
            return Integer.parseInt(rank);
        } catch (NumberFormatException e) {
            switch (rank) {
                case "Jack":
                    return 11;
                case "Queen":
                    return 12;
                case "King":
                    return 13;
                case "Ace":
                    return 14;
                default:
                    return 10;
            }
        }
    }

    private static void displayWarCards(Player player, List<Card> cards) {
        for (Card card : cards) {
            System.out.println(player.getPlayerName() + " flips: " + card.getCardSymbol() + card.getRank());
        }
    }

}
