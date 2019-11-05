package io.zipcoder.polymorphism;

import java.awt.*;
import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public ArrayList<String> petNames;

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("\nHow many pets do you have?");
        Integer numberOfPets = sc.nextInt();

//        Console console = new Console();
//
//        Integer numberOfPets = console.getIntegerInput("How many pets do you have?");

        for (int i = 0; i <= numberOfPets; i++)
        System.out.println(String.format("\nWhat is the name of Pet %d ?", i));
         //this.petNames.add(sc.next());

    }
}
