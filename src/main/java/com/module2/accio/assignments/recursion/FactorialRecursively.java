package com.module2.accio.assignments.recursion;

import java.util.*;

public class FactorialRecursively {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int result = fact(n);
    System.out.println(result);
  }

  private static int fact(int n) {
    if (n < 2) {
      return 1;
    }
    return n * fact(n - 1);
  }
}
