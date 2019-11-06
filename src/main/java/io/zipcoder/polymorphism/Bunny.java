package io.zipcoder.polymorphism;

public class Bunny extends Pet {


    public Bunny (String name) {
        super (name);
    }

    public Bunny(String name, String petType) {
        super(name, petType);
    }

    @Override
    public String speak(){
        return "Happy Easter!";
    }

}
