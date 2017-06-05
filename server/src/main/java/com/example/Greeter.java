package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  * @param someone somone
  * @return greeting greting 
  */
  public final String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
