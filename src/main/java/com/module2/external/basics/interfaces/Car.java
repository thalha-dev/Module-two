package com.module2.external.basics.interfaces;


public class Car implements Engine, Brake, Media {


  @Override
  public void brake(){
    System.out.println("brake method");
  }

  @Override
  public void start() {
    System.out.println("start method");

  }

  @Override
  public void stop() {
    System.out.println("stop method");

  }

  @Override
  public void acc() {
    System.out.println("acc method");

  }
}
