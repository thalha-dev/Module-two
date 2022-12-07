package com.module2.external.recursion.intro;

public class CountZeros {
  public static void main(String[] args) {
    System.out.println(count1(390340, 0));
  }

  static int count1(int n, int count) {
    if (n == 0) {
      return count;
    }
    if ((n % 10) == 0) {
      return count1(n / 10, count + 1);
    } else {
      return count1(n / 10, count);
    }
  }
}
