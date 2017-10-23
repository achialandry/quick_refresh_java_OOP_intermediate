/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_intermediate;

/**
 *
 * @author user
 */
public class Car_Class {
    public String color = "Black";
    private int number_of_seats = 5;
    private int fuel_capacity = 50;
    private String mInterior;

    //applying a getter to private int number_of_seats variable
    public int getNumber_of_seats() {
        return number_of_seats;
    }
    
    //applying getter for fuel_capacity
    public int getFuel_capacity() {
        return fuel_capacity;
    }

    //applying getter for mInterior
    public String getmInterior() {
        return mInterior;
    }
    
    
    //adding a no Constructor == instance of object
    public Car_Class(){
        
    }
    
    //parametised Constructor
    public Car_Class(String chosenColor){
        color = chosenColor;
    }
    
    public Car_Class(int mfuel, String chosenInterior){
        fuel_capacity = mfuel;
        mInterior = chosenInterior;
    }
    
    //behavior of class
    public void drive() {
        System.out.println("Car is moving");
}
    
    
}
