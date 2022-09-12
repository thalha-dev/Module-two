package com.module2.external.basics.properties.inheritance;


public class Box {
  protected String brand = "Ford"; // Box attribute

  public Box() {}

  public Box(String brand, String n) {
    this.brand = brand;
    this.n = n;
  }

  String n = "hello";

  public void honk() { // Box method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Box {
  public Car(String brand, String n, String modelName, String s) {
    super(brand, n);
    this.modelName = modelName;
    this.s = s;
  }

  public Car() {}

  String modelName = "Mustang"; // Car attribute
  String s = "sfsd";
}
