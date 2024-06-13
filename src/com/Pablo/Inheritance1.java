package com.Pablo;
/**
* @author Pablo Espinoza
* @date 03/25/2024
* Demonstrates inheritance in Java with Car and SpecificCar classes.
*/
public class Inheritance1 {
   public static void main(String[] args) {
       SpecificCar c = new SpecificCar("Honda", "Civic");
      
       // this does something
       c.pressHorn();
       c.pressGas();
       System.out.println(c.getMake());
       System.out.println(c.getModel());
   }
}
class Car {
   private String make;
   // yoo I was here
   public Car(String make) {
       this.make = make;
   }
   public void pressHorn() {
       System.out.println("Honk honk.");
   }
   public void pressGas() {
       System.out.println("Zoom zoom.");
   }
   // ok
  
   public String getMake() {
       return make;
   }
}
class SpecificCar extends Car {
   private String model;
   public SpecificCar(String make, String model) {
       super(make);
       this.model = model;
   }
   @Override
   public void pressHorn() {
       System.out.println("Beep beep.");
   }
   public String getModel() {
       return model;
   }
}
