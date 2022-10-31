package com.module2.external.Search.questions;

public class infiniteArray {

  static int binarySearch(int[] arr, int target, int start, int end) {

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

  static int ans(int[] arr, int target) {
    int start = 0;
    int end = 1;
    while (target > arr[end]) {
      int newStart = end + 1;
      end = end + (end - start + 1) * 2;
      start = newStart;
    }
    return binarySearch(arr, target, start, end);
  }

  public static void main(String[] args) {
    int[] arr = {
      2, 3, 4, 5, 6, 12, 19, 21, 27, 38, 48, 55, 56, 76, 78, 79, 82, 84, 85, 86, 92, 844, 35435,
      4332342
    };
    int ans = ans(arr, 55);
    System.out.println(ans);
  }
}
