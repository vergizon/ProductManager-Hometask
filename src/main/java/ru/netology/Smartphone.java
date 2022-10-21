package ru.netology;

public class Smartphone extends Product{
    private String name;
    private String producer;

    public Smartphone(int id, String name, int cost, String producer){
        super(id, name, cost);
        this.name = name;
        this.producer = producer;

    }

}
