package com.module2.external.recursion.intro;

public class Fibo {
  public static void main(String[] args) {
    System.out.println(fibbonacci(4));
  }

  static int fibbonacci(int n) {
    if (n < 2) {
      return n;
    }
    return fibbonacci(n - 1) + fibbonacci(n - 2);
  }
}
