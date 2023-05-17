package com.codecool.playingcards;

import com.codecool.playingcards.model.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        Card card1 = new Card("Ace", Suit.SPADES);
        Card card2 = new Card("Ace", Suit.SPADES);

        List<Card> deck = generateFrenchDeck();

        for (int i = 0; i < deck.size(); i++) {
            out.println(i + 1 + " - " + deck.get(i));
        }
    }

    private static List<Card> generateFrenchDeck() {
        List<Card> deck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            addNumberedCards(deck, suit);
            addCourtCards(deck, suit);
        }
        return deck;
    }

    private static void addNumberedCards(List<Card> deck, Suit suit) {
        for (int i = 2; i <= 10; i++) {
            Card card = new Card(String.valueOf(i), suit);
            deck.add(card);
        }
    }

    private static void addCourtCards(List<Card> deck, Suit suit) {
        String[] courtSymbols = {"Jack", "Queen", "King", "Ace"};

        for (String courtSymbol : courtSymbols) {
            Card card = new Card(courtSymbol, suit);
            deck.add(card);
        }
    }
}