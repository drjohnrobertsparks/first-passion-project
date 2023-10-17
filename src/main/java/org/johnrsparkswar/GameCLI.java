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
        System.out.println("           Now that we have that cleared up,");
        System.out.println("         Please select your number of players");
        System.out.println("Please select between one and ten players(1, 3, 5, etc.):");
        int numberOfPlayers = Integer.parseInt(userInput.nextLine());

    }





}
