package com.module2.external.Search.questions;

import java.util.*;

public class MinimumRemovals {
  static int findInd(int key, int i, int n, int k, int arr[]) {
    int start, end, mid, ind = -1;
    start = i + 1;
    end = n - 1;
    while (start < end) {
      mid = start + (end - start) / 2;
      if (arr[mid] - key <= k) {
        ind = mid;
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return ind;
  }

  static int removals(int arr[], int n, int k) {
    int i, j, ans = n - 1;
    Arrays.sort(arr);
    for (i = 0; i < n; i++) {
      j = findInd(arr[i], i, n, k, arr);
      if (j != -1) {
        ans = Math.min(ans, n - (j - i + 1));
      }
    }
    return ans;
  }

  public static void main(String args[]) {
    int arr[] = {1, 3, 4, 9, 10, 11, 12, 17, 20};
    int n = arr.length;
    int k = 4;

    System.out.println(removals(arr, n, k));
  }
}
