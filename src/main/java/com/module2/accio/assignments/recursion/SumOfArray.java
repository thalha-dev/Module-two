package com.module2.accio.assignments.recursion;

import java.util.*;

public class SumOfArray {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    int sum = arrSum(arr, 0);
    System.out.println(sum);
  }

  private static int arrSum(int[] arr, int index) {
    if (index == arr.length) {
      return 0;
    }
    return arr[index] + arrSum(arr, ++index);
  }
}
