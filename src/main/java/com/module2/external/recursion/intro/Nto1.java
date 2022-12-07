package com.module2.external.recursion.intro;

public class Nto1 {
  public static void main(String[] args) {
    print(8);
    System.out.println();
    printRev(8);
  }

  static void print(int n) {
    if (n == 0) {
      return;
    }
    System.out.print(n + " ");
    print(n - 1);
  }

  static void printRev(int n) {
    if (n == 0) {
      return;
    }
    printRev(n - 1);
    System.out.print(n + " ");
  }
}
