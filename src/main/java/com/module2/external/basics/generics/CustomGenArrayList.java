package com.module2.external.basics.generics;


import java.util.Arrays;

public class CustomGenArrayList<T> {

  private Object[] data;
  private static int DEFAULT_SIZE = 10;
  private int size = 0;

  public CustomGenArrayList() {
    this.data = new Object[DEFAULT_SIZE];
  }

  public void add(T num) {
    if (isFull()) {
      resize();
    }
    data[size++] = num;
  }

  private void resize() {
    Object[] temp = new Object[data.length * 2];

    for (int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }

    data = temp;
  }

  private boolean isFull() {
    return size == data.length;
  }

  private T remove() {
    T removed = (T) data[--size];
    return removed;
  }

  private T get(int index) {
    return (T)data[index];
  }

  private int size() {
    return size;
  }

  private void set(int index, T value) {

    data[index] = value;
  }

  @Override
  public String toString() {
    return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
  }

  public static void main(String[] args) {

    CustomGenArrayList<Integer> list = new CustomGenArrayList<>();

    list.add(2424);

    for (int i = 0; i < 3; i++) {
      list.add(2 * i);
    }

    System.out.println(list);
  }
}
