package com.module2.accio.assignments;

import java.util.*;

public class TriangluarNumber {

  static int binarySearch(int target) {

    int start = 1;
    int end = target;
    // n * (n+1) / 2 ------> sum of all natural numbers

    while (start <= end) {
      int mid = start + (end - start) / 2;
      int sum = (mid * (mid + 1)) / 2;
      if (sum < target) {
        start = mid + 1;
      } else if (sum > target) {
        end = mid - 1;
      } else {
        return 1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println(binarySearch(x));
  }
}
