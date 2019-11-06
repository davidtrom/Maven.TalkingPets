package io.zipcoder.polymorphism;

public class Pet {
    String name;
    String type;



    //Constructors
    public Pet (String name, String type) {
        this.name=name;
        this.type = type;
    }
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

    public void setType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public String speak(){
    return null;
    }
}
