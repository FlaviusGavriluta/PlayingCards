package com.codecool.playingcards;

import com.codecool.playingcards.model.*;

import java.util.Scanner;

import static java.lang.System.out;


public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Card card1 = new Card("Ace", Suit.SPADES);
        Card card2 = new Card("Ace", Suit.SPADES);
        out.println(card1.equals(card2));

        out.println(card1);
        out.println(card2);
        scanner.nextLine();
    }
}