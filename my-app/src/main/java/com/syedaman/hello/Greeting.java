package com.syedaman.hello;

public class Greeting {
  private String name;

  public Greeting(String name) {
    this.name = name;
  }

  public String sayHello() {
    return "Hello world!";
  }

  public String introduce() {
    return String.format("My name is %s and I am %d years old.", name, 5);
  }
}
