package io.zipcoder.polymorphism;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {

        //creates a new console object to print out the results
        Console console = new Console(System.in, System.out);

        ArrayList<Pet> myPets = new ArrayList<Pet>();

        //creates a new scanner to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("\nHow many pets do you have?\n");
        Integer numberOfPets = sc.nextInt();

        //creates a new pet array
        //Pet[] myPets = new Pet[numberOfPets];

        //For Loop to iterate and get the name and type of the number of pets
        //Once they are received they are inputted into the Pet Constructor to create the pet
        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What is the name of your pet?\n");
            String petName = sc.next();
            System.out.println("What type of pet is it?\n(Dog, Cat, or Bunny)\n");
            String petType = sc.next();
            myPets.add(i, new Pet(petName, petType));
        }

        //uses the console object to print the results with two different ways - one being a list and the other being
        //a more formatted sentence.
        console.printToString(numberOfPets, myPets);
        //console.printListFormat(numberOfPets, myPets);

    }
}









