package com.module2.external.basics.stack;

class IamStack {
  protected int[] data;
  private static final int DEFAULT_SIZE = 10;

  int ptr = -1;

  public IamStack() {
    this(DEFAULT_SIZE);
  }

  public IamStack(int size) {
    this.data = new int[size];
  }

  public boolean push(int item) {
    if (isFull()) {
      System.out.println("Stack is Full");
      return false;
    }
    ptr++;
    data[ptr] = item;
    return true;
  }

  public int pop() throws StackException {
    if (isEmpty()) {
      throw new StackException("Stack is Empty");
    }
    // int removed = data[ptr];
    // ptr--;
    // return removed;
    return data[ptr--];
  }

  public int peek() throws StackException {
    if (isEmpty()) {
      throw new StackException("Can't peek from empty stack");
    }
    return data[ptr];
  }

  boolean isFull() {
    return ptr == data.length - 1;
  }

  boolean isEmpty() {
    return ptr == -1;
  }
}
