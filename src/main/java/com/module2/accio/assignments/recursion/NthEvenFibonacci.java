package com.module2.accio.assignments.recursion;

import java.util.*;

public class NthEvenFibonacci {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int result = fibo(n, 0, 1, 0);
    System.out.println(result);
  }

  private static int fibo(int target, int a, int b, int counter) {
    int sum = a + b;
    if (sum % 2 == 0) {
      counter++;
    }
    if (counter == target) {
      return sum;
    } else {
      return fibo(target, b, sum, counter);
    }
  }
}
