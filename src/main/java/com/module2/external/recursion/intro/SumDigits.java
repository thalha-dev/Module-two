package com.module2.external.recursion.intro;

public class SumDigits {
  public static void main(String[] args) {
    System.out.println(sum(3234));
    System.out.println(product(32));
  }

  static int sum(int n) {
    if (n == 0) {
      return 0;
    }
    return (n % 10) + sum(n / 10);
  }

  static int product(int n) {
    if (n == 0) {
      return 1;
    }
    return (n % 10) * product(n / 10);
  }
}
