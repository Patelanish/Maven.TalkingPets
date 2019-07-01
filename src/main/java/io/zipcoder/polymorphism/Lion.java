package io.zipcoder.polymorphism;

public class Lion extends Pet {
    public Lion(String name) {
        super(name);
    }
    public void SetName (String name){
        this.name = name;
    }

    public String speak(){
        return "You betta run!";
    }

}
