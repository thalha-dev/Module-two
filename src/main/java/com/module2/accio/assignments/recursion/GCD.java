package com.module2.accio.assignments.recursion;

import java.util.*;

public class GCD {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    sc.close();
    int minimum = (n1 < n2) ? n1 : n2;
    int result = gcd(n1, n2, minimum);
    System.out.println(result);
  }

  private static int gcd(int n1, int n2, int min) {
    if (min < 2) {
      return 1;
    }
    if (n1 % min == 0 && n2 % min == 0) {
      return min;
    } else {
      return gcd(n1, n2, --min);
    }
  }
}
