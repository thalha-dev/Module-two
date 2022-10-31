package com.module2.external.Search.questions;

import java.util.Scanner;

public class FindTargetIndices2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int target = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    int count = 0;
    int lessthan = 0;
    for (int n : arr) {
      if (n == target) count++;
      if (n < target) lessthan++;
    }
    if (count == 0) {
      System.out.print(-1);
      return;
    }

    for (int i = 0; i < count; i++) {
      System.out.print(lessthan++ + " ");
    }
  }
}
