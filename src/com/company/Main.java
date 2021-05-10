package com.company;

public class Main {

    public static void main(String[] args) {
        Deck newDeck = new Deck();
        newDeck.printDeck();
        System.out.println("====== After shuffling======");
        newDeck.shuffle();
        newDeck.printDeck();
        System.out.println("=======The Top Card ========");
        newDeck.drawTopCard().printCard();
        System.out.println("=======The Random dranw Card===");
        newDeck.randomDraw().printCard();
    }
}
