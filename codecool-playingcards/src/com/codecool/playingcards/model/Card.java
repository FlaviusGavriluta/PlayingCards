package com.codecool.playingcards.model;

public class Card {

    private final String symbol;
    private final Suit suit;
    private final String title;


    public Card(String symbol, Suit suit) {
        this.symbol = symbol;
        this.suit = suit;
        title = createTitle();
    }

    public String createTitle(){
        return this.symbol + " of " + this.suit;
    }

    public String getTitle(){
        return title;
    }

    public String getSymbol() {
        return symbol;
    }

    public Suit getSuit() {
        return suit;
    }
}