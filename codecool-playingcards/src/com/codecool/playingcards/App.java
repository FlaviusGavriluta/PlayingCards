package com.codecool.playingcards;

import com.codecool.playingcards.model.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        FrenchCard card1 = new FrenchCard("Ace", FrenchSuit.SPADES);
        FrenchCard card2 = new FrenchCard("Ace", FrenchSuit.SPADES);

        List<FrenchCard> deck = generateFrenchDeck();

        for (int i = 0; i < deck.size(); i++) {
            out.println(i + 1 + " - " + deck.get(i));
        }
    }

    private static List<FrenchCard> generateFrenchDeck() {
        List<FrenchCard> deck = new ArrayList<>();

        for (FrenchSuit suit : FrenchSuit.values()) {
            addNumberedCards(deck, suit);
            addCourtCards(deck, suit);
        }
        return deck;
    }

    private static void addNumberedCards(List<FrenchCard> deck, FrenchSuit suit) {
        for (int i = 2; i <= 10; i++) {
            FrenchCard card = new FrenchCard(String.valueOf(i), suit);
            deck.add(card);
        }
    }

    private static void addCourtCards(List<FrenchCard> deck, FrenchSuit suit) {
        String[] courtSymbols = {"Jack", "Queen", "King", "Ace"};

        for (String courtSymbol : courtSymbols) {
            FrenchCard card = new FrenchCard(courtSymbol, suit);
            deck.add(card);
        }
    }
}