package org.johnrsparkswar;

public class Player {
    private String name;

    private boolean isComputerPlayer;

    public String getName() {
        return name;
    }

    public boolean isComputerPlayer() {
        return isComputerPlayer;

    }

    public Player(String name, boolean isComputerPlayer) {
        this.name = name;
        this.isComputerPlayer = isComputerPlayer;
    }

    public void Player(String name, boolean isComputerPlayer){

    }

    Player computer = new Player("WarLord", true);
    Player userOne = new Player("PlayerOne", false);
    Player userTwo = new Player("PlayerTwo", false);
    Player userThree = new Player("PlayerThree", false);
    Player userFour = new Player("PlayerFour", false);
    Player userFive = new Player("PlayerFive", false);
    Player userSix = new Player("PlayerSix", false);
    Player userSeven = new Player("PlayerSeven", false);
    Player userEight = new Player("PlayerEight", false);
    Player userNine = new Player("PlayerNine", false);
    Player userTen = new Player("PlayerTen", false);




}
