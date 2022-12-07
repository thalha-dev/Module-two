package com.module2.accio.assignments.recursion;

import java.util.*;

public class SumOfNaturalNumbers {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int result = sum(n);
    System.out.println(result);
  }

  private static int sum(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sum(--n);
  }
}
