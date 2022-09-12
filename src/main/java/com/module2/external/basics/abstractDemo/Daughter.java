package com.module2.external.basics.abstractDemo;

public class Daughter extends Parent {

  Daughter(int age){
    this.age = age;
  }

  @Override
  void career() {
    System.out.println("I am going to be a artist " );
  }

  @Override
  void patner() {
    System.out.println("I love Iron man ");
  }
}
