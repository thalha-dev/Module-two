package com.module2.external.recursion.intro;

public class Intro {
  public static void main(String[] args) {
    message();
  }

  static void message() {
    System.out.println("hello world");
    message2();
  }

  static void message2() {
    System.out.println("hello world");
    message3();
  }

  static void message3() {
    System.out.println("hello world");
    message4();
  }

  static void message4() {
    System.out.println("hello world");
  }
}
