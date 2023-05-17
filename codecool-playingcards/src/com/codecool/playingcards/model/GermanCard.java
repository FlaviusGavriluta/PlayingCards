package com.codecool.playingcards.model;

public class GermanCard {
    private final String symbol;
    private final GermanSuit suit;

    private final String title;

    public GermanCard(String symbol, GermanSuit suit) {
        this.symbol = symbol;
        this.suit = suit;
        this.title = this.symbol + " of " + this.suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public GermanSuit getSuit() {
        return suit;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
