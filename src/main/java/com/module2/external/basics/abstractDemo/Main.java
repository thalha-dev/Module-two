package com.module2.external.basics.abstractDemo;


public class Main {
  public static void main(String[] args) {

    Son son = new Son(24);
    son.career();
    son.patner();
    System.out.println(son.age);
    son.age = 233;
    System.out.println(son.age);

    Daughter daughter = new Daughter(19);
    daughter.career();
    daughter.patner();
    System.out.println(daughter.age);
  }
}
