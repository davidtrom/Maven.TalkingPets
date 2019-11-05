package io.zipcoder.polymorphism;

public class Pet {
    String name;

//Constructor
    public Pet (String name) {
        this.name=name;
    }

    public Pet(){

    }

    public void setName(String name){
        this.name=name;
    }

    public String getName (){
        return name;
    }

    public String speak(){
    return null;
    }
}
