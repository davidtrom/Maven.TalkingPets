package io.zipcoder.polymorphism;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public final class Console {
   //instance variables
    private final Scanner input;
    private final PrintStream output;
    private Pet [] myPets;
    Integer numberOfPets;

    //constructor
    public Console(InputStream in, PrintStream out) {
        this.input = new Scanner(in);
        this.output = out;
    }

//    public void printToString(Integer numberOfPets, ArrayList<Pet> myPets) {
//        String speaks = "";
//        for (int i = 0; i < numberOfPets; i++) {
//            if (myPets.get(i).getType().equals("Dog")) {
//                speaks = "Woof!";
//            } else if (myPets.get(i).getType().equals("Cat")) {
//                speaks = "Meow!";
//            } else {
//                speaks = "Happy Easter!";
//            }
//
//            System.out.println("Your pet: " +  myPets.get(i).getType() + "        Named: " + myPets.get(i).getName() + "          Says: " + speaks);
//
//        }
//
//    }

    public void printListFormat (Integer numberOfPets, ArrayList<Pet> myPets){
        StringBuilder sb = new StringBuilder();
        String result = "";
        String speaks = "";
        for (int i = 0; i < numberOfPets; i++) {
            if (myPets.get(i).getType().equals("Dog")) {
                speaks = "Woof!";
            } else if (myPets.get(i).getType().equals("Cat")) {
                speaks = "Meow!";
            } else {
                speaks = "Happy Easter!";
            }
            result = sb.append(myPets.get(i).getName()).append("            ").append(myPets.get(i).getType()).append("            ").append(speaks).append("\n").toString();

        }

        System.out.println(result);
    }

}
