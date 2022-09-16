package com.module2.external.basics.cloning;

public class Human implements Cloneable {
  int age;
  String name;
  int[] arr;

  public Human(Human other) {
    this.age = other.age;
    this.name = other.name;
  }

  public Human(int age, String name) {
    this.age = age;
    this.name = name;
    this.arr = new int[] {5, 24, 22, 1, 50, 44};
  }

  // SHALLOW COPY
  //
  // public Object clone() throws CloneNotSupportedException {
  //   return super.clone();
  // }

  // DEEP COPY
  //
  public Object clone() throws CloneNotSupportedException {
    Human twin = (Human) super.clone();
    twin.arr = new int[twin.arr.length];
    for (int i = 0; i < twin.arr.length; i++) {
      twin.arr[i] = this.arr[i];
    }
    return twin;
  }
}
