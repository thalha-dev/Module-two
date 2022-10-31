package com.module2.external.Search.questions;

public class SearchInMountain {

  static int search(int[] arr, int target) {
    int peak = peakIndexInMountainArray(arr);
    int firstTry = binarySearch(arr, target, 0, peak);
    if (firstTry != -1) {
      return firstTry;
    }
    return binarySearch(arr, target, peak + 1, arr.length - 1);
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

  static int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > arr[mid + 1]) {
        // decrecing part of array
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }

  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 5, 6, 12, 19, 21, 20, 19, 12, 6, 5, 4, 3, 2, 1};
    System.out.println(search(arr, 21));
  }
}
