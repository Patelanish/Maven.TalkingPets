package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    public void SetName (String name){
        this.name = name;
    }

    public String speak(){
        return "WhatEver!";
    }
}
