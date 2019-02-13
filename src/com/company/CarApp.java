package com.company;

import java.util.ArrayList;

public class CarApp {

    public static void main(String[] args) {
	Vehicle car = new Vehicle();
    Vehicle porsche = new Vehicle("Porsche", "red", "50mph", 50, "Passes inspection","passed the red porsche");
    Vehicle jetta = new Vehicle("Jetta", "blue", "50mph", 60, "Passes inspection","passed the red porsche");

    Car c = new Car();

	    //Call The method and its Attributes by name
        System.out.println();
        System.out.println("The " + porsche.getColor() +" "+ porsche.getName()+ " is starting");
        System.out.println("The " + porsche.getColor() +" "+ porsche.getName()+ " is accelerating");
        System.out.println("The " + porsche.getColor() +" "+ porsche.getName()+ " is going "+ porsche.getAccelerate());
        System.out.println("The " + porsche.getColor() +" "+ porsche.getName()+ " stopped");


        // Next Create a new car instance called Jetta
        // And
        System.out.println();
        System.out.println();
        System.out.println("The " + porsche.getColor() +" "+ porsche.getName()+ " is starting");
        System.out.println("The " + jetta.getColor() +" "+ jetta.getName()+ " is starting");
        System.out.println("The " + porsche.getColor() +" "+ porsche.getName()+ " is accelerating");
        System.out.println("The " + jetta.getColor() +" "+ jetta.getName()+ " is accelerating");
        System.out.println("The " + jetta.getColor() +" "+ jetta.getName()+ " has stopped to have its emissions checked");
        System.out.println("The " + jetta.getColor() +" "+ jetta.getName()+ jetta.getEmission()+ " Test");
        System.out.println("The " + porsche.getColor() +" "+ porsche.getName()+ " is going "+ porsche.getSpeed());
        System.out.println("The " + porsche.getColor() +" "+ porsche.getName() +" stopped");
        System.out.println("The " + jetta.getColor() +" "+ jetta.getName()+ " just "+ jetta.getPassing());


    }
}