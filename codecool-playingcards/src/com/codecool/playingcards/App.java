package com.codecool.playingcards;

import com.codecool.playingcards.model.*;

import java.util.Scanner;

import static java.lang.System.out;


public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Card card = new Card("Ace", Suit.SPADES);
        out.println(card.getTitle());
        scanner.nextLine();
    }
}