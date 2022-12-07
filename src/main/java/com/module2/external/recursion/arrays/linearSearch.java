package com.module2.external.recursion.arrays;

import java.util.ArrayList;

public class linearSearch {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 4, 4, 4, 5, 6, 7, 9};
    // int[] arr = {1, 3, 4};
    System.out.println(searchExistance(arr, 0, 4));
    System.out.println(searchIndex(arr, 0, 4));
    // searchAllIndex(arr, 0, 4);
    // System.out.println(list);
    System.out.println(searchAllIndex2(arr, 0, 4, new ArrayList<Integer>()));
  }

  static boolean searchExistance(int[] arr, int index, int target) {
    if (index == arr.length) {
      return false;
    }
    return arr[index] == target || searchExistance(arr, index + 1, target);
  }

  static int searchIndex(int[] arr, int index, int target) {
    if (index == arr.length) {
      return -1;
    }
    if (arr[index] == target) {
      return index;
    } else {
      return searchIndex(arr, index + 1, target);
    }
  }

  static ArrayList<Integer> list = new ArrayList<>();

  static void searchAllIndex(int[] arr, int index, int target) {
    if (index == arr.length) {
      return;
    }
    if (arr[index] == target) {
      list.add(index);
    }
    searchAllIndex(arr, index + 1, target);
  }

  static ArrayList<Integer> searchAllIndex2(
      int[] arr, int index, int target, ArrayList<Integer> list) {
    if (index == arr.length) {
      return list;
    }
    if (arr[index] == target) {
      list.add(index);
    }
    return searchAllIndex2(arr, index + 1, target, list);
  }
}
