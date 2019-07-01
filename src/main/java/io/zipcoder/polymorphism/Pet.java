package io.zipcoder.polymorphism;

public class Pet {
    public String name;
    private String speak;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Pet (String name){
        this.name = name;
    }

    public String speak(){
        return"Anything";
    }
}
