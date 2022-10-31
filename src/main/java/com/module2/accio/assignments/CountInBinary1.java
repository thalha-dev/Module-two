package com.module2.accio.assignments;

import java.util.Scanner;

public class CountInBinary1 {
  static int findLast(int[] arr) {

    int start = 0;
    int one = 1;
    int end = arr.length - 1;
    if (arr[end] > one) {
      return -1;
    }

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < one) {
        end = mid - 1;
      } else if (arr[mid] > one) {
        start = mid + 1;
      } else {
        start = mid + 1;
      }
    }
    return end;
  }

  static int findFirst(int[] arr) {

    int start = 0;
    int one = 1;
    int end = arr.length - 1;
    if (arr[end] > one) {
      return -1;
    }

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < one) {
        end = mid - 1;
      } else if (arr[mid] > one) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return start;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    int start = findFirst(arr);
    int end = findLast(arr);
    System.out.println((end - start) + 1);
  }
}
