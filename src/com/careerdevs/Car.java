package com.careerdevs;
import java.util.Scanner;
//a class thats only purpose is to create a plain old java object
public class Car {
    private String make;
    private String model;
    private boolean isRented;

    public Car(String make, String model, boolean isRented) {
        this.make = make;
        this.model = model;
        this.isRented = isRented;

    }
     @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", isRented=" + isRented +
                '}';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getName(){
        return make + " " + model;
    }

    public boolean isRented() {
        return isRented;
    }

    public boolean setRented(boolean rented) {
        isRented = rented;
        return rented;
    }

}