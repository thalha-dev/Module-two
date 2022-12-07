package com.module2.external.recursion.intro;

public class Steps {
  public static void main(String[] args) {
    System.out.println(numberOfSteps(5));
  }

  static int numberOfSteps(int num) {
    return helper(num, 0);
  }

  static int helper(int n, int steps) {
    if (n == 0) {
      return steps;
    }
    if (n % 2 == 0) {
      return helper(n / 2, steps + 1);
    }
    return helper(n - 1, steps + 1);
  }
}
