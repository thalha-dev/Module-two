package com.module2.external.basics.cloning;

public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {
    Human thalha = new Human(20, "thalha");
    // Human twin = new Human(thalha);

    Human twin = (Human) thalha.clone();
    System.out.println(thalha);
    System.out.println(twin);
  }
}
