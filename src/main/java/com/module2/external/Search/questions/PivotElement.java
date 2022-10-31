package com.module2.external.Search.questions;

public class PivotElement {

  static int findPivotInAccArray(int[] nums) {
    if (nums == null || nums.length == 0) return -1;

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int midpoint = left + (right - left) / 2;
      if (nums[midpoint] > nums[right]) {
        left = midpoint + 1;
      } else {
        right = midpoint;
      }
    }
    return left;
  }

  static int findPivotInDccArray(int[] nums) {
    if (nums == null || nums.length == 0) return -1;

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int midpoint = left + (right - left) / 2;
      if (nums[midpoint] < nums[right]) {
        left = midpoint + 1;
      } else {
        right = midpoint;
      }
    }
    return left;
  }

  public static void main(String[] args) {
    int[] arr1 = {6, 11, 23, 23, 1, 1, 2, 3, 4, 5};
    int[] arr2 = {12, 5, 4, 3, 2, 1, 99, 45, 33, 15};
    System.out.println(findPivotInAccArray(arr1));
    System.out.println(findPivotInDccArray(arr2));
  }
}
