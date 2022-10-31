package com.module2.external.Search.questions;

import java.util.*;

public class FindTargetIndices {
  static int searchFirst(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int startIndex = -1;

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
        startIndex = mid;
        end = mid - 1;
      }
    }
    return startIndex;
  }

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int target = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    Arrays.sort(arr);
    int index = searchFirst(arr, target);
    if (index == -1) {
      System.out.println(-1);
      return;
    }
    int value = arr[index];
    while (arr[index] == value) {
      System.out.print(index + " ");
      index++;
    }
  }
}
