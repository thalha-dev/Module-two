package com.module2.external.Search.questions;

public class RotationCount {


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

  static int rotationCount(int[] arr){
    int pivot = findPivot(arr);
    return pivot;
  }
  public static void main(String[] args) {
    int[] arr = {6, 11, 23, 1, 2, 3, 4, 5};
    int[] arr2 = {24, 234, 1, 2, 3, 4, 5, 6, 7, 8};
    int[] arr3 = {342, 1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println(rotationCount(arr));
    System.out.println(rotationCount(arr2));
    System.out.println(rotationCount(arr3));
  }
}
