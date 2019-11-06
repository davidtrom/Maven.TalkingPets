package io.zipcoder.polymorphism;

public class Dog extends Pet {

    public Dog (String name) {
        super (name);
    }


    public Dog (String name, String petType) {
        super (name, petType);
    }


    @Override
    public String speak(){
        return "Woof!";
    }

}
