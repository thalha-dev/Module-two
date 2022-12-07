package com.module2.accio.assignments.recursion;

import java.util.*;

public class CountX {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();

    int x = count(str, str.length(), 0, 0);
    System.out.println(x);
  }

  private static int count(String str, int length, int index, int counter) {
    if (index == length) {
      return counter;
    }
    if (str.charAt(index) == 'x') {
      return count(str, length, index + 1, ++counter);
    }
    return count(str, length, index + 1, counter);
  }
}
