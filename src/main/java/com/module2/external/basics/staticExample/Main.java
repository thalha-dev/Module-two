package com.module2.external.basics.staticExample;


public class Main {
  public static void main(String[] args) {

    Human thalha = new Human(20, "thalha", 30000, false);
    Human mark = new Human(22, "mark", 20000, true);
    System.out.println(thalha.name);
    System.out.println(mark.name);
    System.out.println(Human.population);
    greeting();
  }
  static void greeting(){
    System.out.println("hello");
  }
}
