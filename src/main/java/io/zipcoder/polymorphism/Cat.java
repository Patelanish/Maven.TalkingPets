package io.zipcoder.polymorphism;

public class Cat extends Pet {

   public Cat(String name){
        super(name);
    }

    public String speak(){
        return "Meow!";
    }

    public void SetName (String name){
        this.name = name;
    }


}
