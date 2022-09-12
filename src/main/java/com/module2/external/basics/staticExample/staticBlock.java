package com.module2.external.basics.staticExample;


/** staticBlock */
public class staticBlock {
  static int a = 1;
  static int b;

  // will only run once when class is initiated 
  static {
    System.out.println("i am in static block");
    b = a* 4;
  }

  public static void main(String[] args) {

    System.out.println(staticBlock.a + " "+ staticBlock.b);
  }
}
