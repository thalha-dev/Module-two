package com.module2.external.Search.questions;

public class RBS {

  static int search(int[] arr, int target) {
    int pivot = findPivot(arr);
    int start = 0;
    int end = arr.length - 1;
    if (pivot == 0) {
     return binarySearch(arr, target, start, end);
    }
    int firstHalf = binarySearch(arr, target, start, pivot - 1);
    int secondHalf = binarySearch(arr, target, pivot, end);
    if (firstHalf != -1) {
      return firstHalf;
    } else {
      return secondHalf;
    }
  }

  static int findPivot(int[] arr) {
    if (arr == null || arr.length == 0) return -1;

    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int midpoint = left + (right - left) / 2;
      if (arr[midpoint] > arr[right]) {
        left = midpoint + 1;
      } else {
        right = midpoint;
      }
    }
    System.out.println("PIVOT -------------->" + left);
    return left;
  }

  static int binarySearch(int[] arr, int target, int start, int end) {

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      }
      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else if (target > arr[mid]) {
          start = mid + 1;
        } else {
          return mid;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else if (target < arr[mid]) {
          start = mid + 1;
        } else {
          return mid;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {6, 11, 23, 1, 2, 3, 4, 5};
    int[] arr2 = {24, 234, 1, 2, 3, 4, 5, 6, 7, 8};
    int[] arr3 = {342, 1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println(search(arr, 4));
    System.out.println(search(arr2, 6));
    System.out.println(search(arr3, 3));
  }
}
