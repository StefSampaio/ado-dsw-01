package br.com.carstore.model;

public class Carro {
    private String name;
    private String color;

    public Carro(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

}