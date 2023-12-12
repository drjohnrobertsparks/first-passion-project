package org.johnrsparkswar;

import java.util.Scanner;

public class GameCLI {

    Scanner userInput = new Scanner(System.in);

    public void greetMessage(){
        System.out.println("****************************************************");
        System.out.println("  ************************************************");
        System.out.println("      ****************************************");
        System.out.println("            ****************************");
        System.out.println("                  This is WAR!!!");
        System.out.println("            ****************************");
        System.out.println("      ****************************************");
        System.out.println("  ************************************************");
        System.out.println("****************************************************");
        System.out.println("                Kidding, don't worry!");
        System.out.println("It's just a friendly, slightly competitive, card game!");
    }

    public Player initializePlayer() {
        System.out.print("Enter player one name: ");
        String playerName = userInput.nextLine();

        Player player = new Player();
        player.setPlayerName(playerName);

        return player;
    }

    public String getUserInput() {

        return userInput.nextLine();
    }








}
