package com.module2.accio.assignments.recursion;

import java.util.*;

public class BunnyEars {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int result = countEars(n, 0);
    System.out.println(result);
  }

  private static int countEars(int n, int i) {
    if (n <= 0) {
      return i;
    }

    return countEars(n - 1, i + 2);
  }
}
