package org.johnrsparkswar;

public class Card {
    public static final char SPADES_SYMBOL = '\u2660';
    public static final char CLUBS_SYMBOL = '\u2663';
    public static final char DIAMONDS_SYMBOL = '\u2666';
    public static final char HEARTS_SYMBOL = '\u2665';
    private String suit;

    private String rank;

    private boolean isFaceUp;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(String suit, String rank, boolean isFaceUp) {
        this.suit = suit;
        this.rank = rank;
        this.isFaceUp = false;
    }

    public void flip(){
        isFaceUp = !isFaceUp;
    }

    public String getCardSymbol(){
        switch (suit) {
            case "Spades":
                return String.valueOf(SPADES_SYMBOL);
            case "Clubs":
                return String.valueOf(CLUBS_SYMBOL);
            case "Diamonds":
                return String.valueOf(DIAMONDS_SYMBOL);
            case "Hearts":
                return String.valueOf(HEARTS_SYMBOL);
            default:
                return "";
        }
    }
}
