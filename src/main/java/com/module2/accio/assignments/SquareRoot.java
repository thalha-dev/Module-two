package com.module2.accio.assignments;

import java.util.Scanner;

public class SquareRoot {

  static int binarySearch(int x) {

    if (x == 0) {
      return 0;
    }

    int start = 1;
    int end = x;
    int ans = 0;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (mid <= x / mid) {
        ans = mid;
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();
    System.out.println(binarySearch(x));
  }
}
