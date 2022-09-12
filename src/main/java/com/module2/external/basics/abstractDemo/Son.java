package com.module2.external.basics.abstractDemo;


public class Son extends Parent {

  Son(int age){
    this.age = age;
  }

  @Override
  void career() {
    System.out.println("I am going to be a doctor ");
  }

  @Override
  void patner() {
    System.out.println("I love pepper potts");
  }
}
