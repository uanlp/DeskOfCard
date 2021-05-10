package com.company;

public class Card {
    private String suite;
    private String rank;

    public Card(String suite, String rank){
        this.suite = suite;
        this.rank = rank;
    }

    public void printCard(){
        System.out.println(rank+ "-" + suite);
    }

    public String getSuite(){
        return this.suite;
    }

    public String getRank(){
        return this.rank;
    }

}
