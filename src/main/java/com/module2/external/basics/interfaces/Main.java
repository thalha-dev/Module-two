package com.module2.external.basics.interfaces;


public class Main {

  public static void main(String[] args) {
    Engine car = new Car();
    car.acc();
    car.stop();
    car.start();
    System.out.println(Engine.PRICE);
  }
}
