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
public class Java_intermediate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new Car_Class object stored in myToyota variable
        Car_Class myToyota = new Car_Class(); 
        myToyota.color = "blue";
        System.out.println(myToyota.color);
        
        //testing a getter here
        System.out.println(myToyota.getNumber_of_seats());
        
        //testing parametised constructor
        Car_Class myHonda = new Car_Class("black");
        System.out.println(myHonda.color);
        
        Car_Class myPeugeot = new Car_Class(65, "wool");
        System.out.println("My Peogeot can take " + myPeugeot.getFuel_capacity() +" litres and interior design is " + myPeugeot.getmInterior() );
        myPeugeot.drive();
        
        //using the inherited class and passing in inherited parameters
        SelfDrivingCar autobot = new SelfDrivingCar(35, "Plastic");
        System.out.println("Fuel: "+ autobot.getFuel_capacity()+ " litres and interior is " + autobot.getmInterior());
        autobot.drive();
    }
    
}
