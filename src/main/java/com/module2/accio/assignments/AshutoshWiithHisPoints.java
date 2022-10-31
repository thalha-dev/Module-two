package com.module2.accio.assignments;

import java.util.*;

public class AshutoshWiithHisPoints {
  static int floor(int[] arr, int target) {

    int start = 0;
    int end = arr.length - 1;

    if (target > arr[end] || target < arr[0]) {
      return -1;
    }

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return end;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    int indexNotFound = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == i) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(indexNotFound);
  }
}
