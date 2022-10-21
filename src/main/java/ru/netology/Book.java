package ru.netology;

public class Book extends Product {
    private String name;
    private String author;

    public Book (int id, String name, int cost, String author){
        super(id, name, cost);
        this.name = name;
        this.author = author;
    }
}
