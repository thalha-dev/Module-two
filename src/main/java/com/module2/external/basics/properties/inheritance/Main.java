package com.module2.external.basics.properties.inheritance;


public class Main {
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car(null, null, null, null);
    Box boxCar = new Car(null, null, null, null);

    System.out.println(boxCar.n);
    // System.out.println(boxCar.s);

    // Call the honk() method (from the Box class) on the myCar object
    myCar.honk();
    boxCar.honk();

    // Display the value of the brand attribute (from the Box class) and the value of the modelName
    // from the Car class
    // System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
