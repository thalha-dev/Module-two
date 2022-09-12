package com.module2.external.basics.generics.comparing;
 
import java.util.Arrays;

public class CustomArrayList {

  private int[] data;
  private static int DEFAULT_SIZE = 10;
  private int size = 0;

  public CustomArrayList() {
    this.data = new int[DEFAULT_SIZE];
  }

  public void add(int num) {
    if (isFull()) {
      resize();
    }
    data[size++] = num;
  }

  private void resize() {
    int[] temp = new int[data.length * 2];

    for (int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }

    data = temp;
  }

  private boolean isFull() {
    return size == data.length;
  }

  private int remove() {
    int removed = data[--size];
    return removed;
  }

  private int get(int index) {
    return data[index];
  }

  private int size() {
    return size;
  }

  private void set(int index, int value) {

    data[index] = value;
  }

  @Override
  public String toString() {
    return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
  }

  public static void main(String[] args) {
    // ArrayList list = new ArrayList();
    CustomArrayList list = new CustomArrayList();
    // list.add(3);
    // list.add(2);
    // list.add(5);
    // System.out.println(list);

    for (int i = 0; i < 14; i++) {
      list.add(2 * i);
    }

    System.out.println(list);
  }
}
