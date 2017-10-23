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

//inheritance applied here with Car_Class being the superclass and SelfDrivingCar is the SubClass
public class SelfDrivingCar extends Car_Class {

    //generating a Constructor fromt the superClass - Car_Class
    public SelfDrivingCar(int mfuel, String chosenInterior) {
        super(mfuel, chosenInterior);
        System.out.println("Constructing Self Driving Car. Initializing Skynet version 9.3.9 ");
    }
    
    //redifining inherited methods from super class
    //using @Override to warn for changes from superclass as well
    
    @Override
    public void drive(){
        super.drive();
        System.out.println("Driving to DownTown - Vancouver on autodrive");
    }
    
    
    
}
