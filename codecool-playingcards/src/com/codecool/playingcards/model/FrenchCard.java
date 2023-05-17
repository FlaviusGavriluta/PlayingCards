package com.codecool.playingcards.model;

import java.util.Objects;

public class FrenchCard {

    private final String symbol;
    private final FrenchSuit suit;
    private final String title;


    public FrenchCard(String symbol, FrenchSuit suit) {
        this.symbol = symbol;
        this.suit = suit;
        title = this.symbol + " of " + this.suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public FrenchSuit getSuit() {
        return suit;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrenchCard card = (FrenchCard) o;
        return Objects.equals(symbol, card.symbol) && suit == card.suit && Objects.equals(title, card.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, suit);
    }

    @Override
    public String toString() {
        return title;
    }
}