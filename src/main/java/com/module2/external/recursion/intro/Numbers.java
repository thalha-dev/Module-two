package com.module2.external.recursion.intro;

public class Numbers {
  public static void main(String[] args) {
    print(0);
  }

  static void print(int n) {
    if (n > 2) {
      return;
    }
    System.out.print(n + " ");
    print(++n);
  }
}
