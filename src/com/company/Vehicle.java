package com.company;


public class Vehicle {

    private String name;
    private String color;
    private String accelerate;
    private int speed;
    private String emission;
    private String passing;


    public Vehicle() {

    }


    public Vehicle(String name,  String color, String accelerate,
                   int speed, String emission, String go) {
                this.name = name;
                this.color = color;
                this.accelerate = accelerate;
                this.speed = speed;
                this.emission = emission;
                this.passing = go;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(String accelerate) {
        this.accelerate = accelerate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission;
    }

    public String getPassing() {
        return passing;
    }

    public void setPassing(String passing) {
        this.passing = passing;
    }

    public static void print(String s) {System.out.println(s);}
}






