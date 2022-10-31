package com.module2.external.Search.questions;

public class SmallestLetter {

  static char nextGreatestLetter(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      System.out.println("BEFORE: Start ==> " + start + " End ==>" + end);
      if (target < letters[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
      System.out.println("AFTER: Start ==> " + start + " End ==>" + end);
    }
    return letters[start % letters.length];
  }

  public static void main(String[] args) {
    char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
    char ans = nextGreatestLetter(arr, 'e');
    System.out.println(ans);
  }
}
