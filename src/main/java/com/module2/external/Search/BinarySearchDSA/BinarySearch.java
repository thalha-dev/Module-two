package com.module2.external.Search.BinarySearchDSA;

public class BinarySearch {

  static int binarySearch(int[] arr, int target) {

    int start = 0;
    int end = arr.length - 1;

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
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {
      2, 3, 4, 5, 6, 12, 19, 21, 27, 38, 48, 55,
    };
    int ans = binarySearch(arr, 5);
    System.out.println(ans);
  }
}

